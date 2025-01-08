package liskovsubstitution;

public class Volunteer extends User{
    public Volunteer(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        throw new RuntimeException("No salary is given to Volunteer");
    }
}
