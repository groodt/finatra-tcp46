import com.twitter.finatra.http.AbstractHttpServer;
import com.twitter.finatra.http.filters.CommonFilters;
import com.twitter.finatra.http.routing.HttpRouter;

public class Server extends AbstractHttpServer {

    @Override
    public String defaultFinatraHttpPort() {
        return "localhost:9090";
    }

    @Override
    public void configureHttp(HttpRouter httpRouter) {
        httpRouter
            .filter(CommonFilters.class)
            .add(Controller.class);
    }
}
