package servicea;

import com.google.gson.Gson;
import spark.Service;

import java.util.UUID;

public class ServiceAHttpApi {

    private ServiceA service;
    private ApiConfiguration configuration;

    ServiceAHttpApi(ServiceA service, ApiConfiguration configuration) {
        this.configuration = configuration;
        this.service = service;
    }

    public void start() {
        Gson gson = new Gson();
        Service server = Service.ignite().port(configuration.getPort()).ipAddress(configuration.getIp());

        server.get("/hello", (req, res) -> service.sayHello());

        server.get("/goodbye", (req,res) -> service.sayGoodbye());

        server.get("/resource/:id", (req,res) -> {
            UUID requestedId = UUID.fromString(req.params(":id"));
            res.status(200);
            return gson.toJson(service.retrieveResource(requestedId));
        });

        server.post("/resource", (req,res) -> {
            UUID resourceId;
            ServiceAResource obj = gson.fromJson(req.body(),ServiceAResource.class);
            resourceId = service.createResource(obj);
            res.header("Location","/resource/" + resourceId.toString());
            res.status(201);
            return "";
        });
    }
}
