package servicea;

class ServiceA{
    private Restful api;
    private int port;

    ServiceA(Restful api) {
        this.api = api;
    }

    public void runOnPort(int port){
        api.runOnPort(port);
    }
}

public class App {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA(new ServiceASparkApi());
        serviceA.runOnPort(8005);
    }
}
