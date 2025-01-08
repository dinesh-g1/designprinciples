package dependencyinversion;

public class DependencyInversion {
    public static void main(String[] args) {
        /*
         * Instead of depending on the concrete implementation of
         * load balancing algorithm, we are injecting the interface
         * LoadBalancer to the APIGateway, thus inverting the Dependency
         */
        LoadBalancer loadBalancer = new ConsistentHashingLB();
        APIGateway apiGateway = new APIGateway(loadBalancer);
        apiGateway.route();
    }
}
