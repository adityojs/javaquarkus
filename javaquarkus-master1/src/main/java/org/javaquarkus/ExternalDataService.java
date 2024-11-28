package org.javaquarkus;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ExternalDataService {

    @Inject
    @RestClient
    ExternalApiClient externalApiClient;

    public Uni<Void> fetchDataAndSave() {
        return Uni.createFrom().item(externalApiClient.getData())
                .onItem().transformToUni(dataList -> {
                    dataList.forEach(apiResponse -> {
                        ExternalData data = new ExternalData();
                        data.name = apiResponse.name;
                        data.description = apiResponse.description;
                        data.persist();
                    });
                    return Uni.createFrom().voidItem();
                });
    }
}