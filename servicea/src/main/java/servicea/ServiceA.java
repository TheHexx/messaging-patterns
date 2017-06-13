package servicea;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.HashMap;
import java.util.UUID;

class ServiceA{

    private final HashMap<UUID,ServiceAResource> hashMap;
    private ServiceAConfiguration configuration;

    ServiceA(ServiceAConfiguration config) {
        this.hashMap = new HashMap<>();
        this.configuration = config;
    }


    String sayHello(){
        return "Hello World !";
    }

    String sayGoodbye(){
        return "Goodbye Cruel World !";
    }

    ServiceAResource retrieveResource(UUID resourceId) {
        Gson gson = new Gson();
        ServiceAEventObject event = new ServiceAEventObject("Resource retrieved!");
        try {
            Unirest.post(configuration.serviceBUrl).body(gson.toJson(event)).asJson();
        } catch ( UnirestException e) {
            System.err.println("ERROR : " + e.getMessage());
        }

        return hashMap.get(resourceId);
    }

    UUID createResource(ServiceAResource resource){
        Gson gson = new Gson();
        ServiceAEventObject event = new ServiceAEventObject("Resource created!");
        try {
            Unirest.post(configuration.serviceBUrl).body(gson.toJson(event)).asJson();
        } catch ( UnirestException e) {
            System.err.println("ERROR : " + e.getMessage());
        }

        UUID newId = UUID.randomUUID();
        hashMap.put(newId,resource);
        return newId;
    }
}
