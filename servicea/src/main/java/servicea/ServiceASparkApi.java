package servicea;
import static spark.Spark.*;

public class ServiceASparkApi implements Restful {

    public void runOnPort(int p) {
        port(p);
        get("/hello", (req, res) -> "Hello World");
    }
}
