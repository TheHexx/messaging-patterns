package serviceb;

public class App {
    public static void main(String[] args) {
        ServiceAHttpApi api = new ServiceAHttpApi(new ServiceA(new ServiceAConfiguration()), new ApiConfiguration());
        api.start();
    }
}