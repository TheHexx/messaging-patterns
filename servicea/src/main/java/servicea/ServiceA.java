package servicea;

public class ServiceA{
    private Restful api;
    private int port;

    ServiceA(Restful api) {
        this.api = api;
    }

    public void runOnPort(int port){
        api.runOnPort(port);
    }
}
