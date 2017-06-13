package servicea;

/**
 * Created by technologydesign3 on 12/06/2017.
 */
class ServiceAConfiguration {
    private static final String DEFAULT_SERVICE_B_URL = "http://127.0.0.1:8002/resources";
    String serviceBUrl;

    ServiceAConfiguration() {
        this.serviceBUrl = DEFAULT_SERVICE_B_URL;
    }
}
