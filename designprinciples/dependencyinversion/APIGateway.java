package dependencyinversion;

public class APIGateway {
    private final LoadBalancer loadBalancer;

    public APIGateway(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    public void route() {
        loadBalancer.distributeLoad();
    }
}
