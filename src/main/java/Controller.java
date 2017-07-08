import com.twitter.finatra.http.AbstractController;
import com.twitter.util.Future;

public class Controller extends AbstractController {
    public void configureRoutes() {
        get("/ping", request ->
            Future.value("pong"));
    }
}
