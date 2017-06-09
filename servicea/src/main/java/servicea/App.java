package servicea;

public class App {
    public static void main(String[] args) {
        ServiceAHttpApi api = new ServiceAHttpApi(new ServiceA(), new ApiConfiguration());
        api.start();
    }
}
