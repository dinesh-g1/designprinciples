package liskovsubstitution;

public class User {
    private final String name;
    private final double salary;

    public User(String name) {
        this.name = name;
        this.salary = 1000.0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
