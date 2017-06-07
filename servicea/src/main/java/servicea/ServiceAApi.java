package servicea;
import static spark.Spark.*;

interface Restful {
    public void runOnPort(int port);
}

class ServiceASparkApi implements Restful {

    public void runOnPort(int p) {
        port(p);
        get("/hello", (req, res) -> "Hello World");
    }
}
