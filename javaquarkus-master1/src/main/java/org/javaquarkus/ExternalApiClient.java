package org.javaquarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
public interface ExternalApiClient {
    @GET
    @Path("/data")
    List<ApiResponse> getData();

    class ApiResponse {
        public String name;
        public String description;
    }
}