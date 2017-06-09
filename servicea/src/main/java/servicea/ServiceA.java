package servicea;

import java.util.HashMap;
import java.util.UUID;

public class ServiceA{

    private final HashMap<UUID,ServiceAResource> hashMap;

    ServiceA() {
        hashMap = new HashMap<>();
    }


    public String sayHello(){
        return "Hello World !";
    }

    public String sayGoodbye(){
        return "Goodbye Cruel World !";
    }

    public ServiceAResource retrieveResource(UUID resourceId) {
        return hashMap.get(resourceId);
    }

    public String createResource(ServiceAResource resource){
        UUID newId = UUID.randomUUID();
        hashMap.put(newId,resource);
        return newId.toString();
    }

}
