package servicea;

public class App {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA(new ServiceASparkApi());
        serviceA.runOnPort(8005);
    }
}
