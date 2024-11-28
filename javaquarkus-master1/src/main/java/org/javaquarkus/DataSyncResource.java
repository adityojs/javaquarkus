package org.javaquarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/sync-data")
public class DataSyncResource {

    @Inject
    ExternalDataService service;

    @GET
    public String syncData() {
        service.fetchDataAndSave()
                .subscribe().with(
                        success -> System.out.println("Data synced successfully"),
                        failure -> System.err.println("Error syncing data: " + failure.getMessage())
                );
        return "Sync process started.";
    }
}