package servicea;

/**
 * Created by technologydesign3 on 09/06/2017.
 */
public class ApiConfiguration {
    private int port;
    private String ip;
    private static final int DEFAULT_PORT = 8001;
    private static final String DEFAULT_IP = "0.0.0.0";

   ApiConfiguration() {
       this.port = DEFAULT_PORT;
       this.ip = DEFAULT_IP;
   }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }
}
