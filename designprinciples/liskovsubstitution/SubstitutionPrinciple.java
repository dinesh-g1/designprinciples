package liskovsubstitution;

import java.util.List;

public class SubstitutionPrinciple {
    public static void main(String[] args) {
        User emp = new Employee(Employee.class.getSimpleName());
        User intern = new Intern(Intern.class.getSimpleName());
        User volunteer = new Volunteer(Volunteer.class.getSimpleName());
        List<User> users = List.of(emp, intern, volunteer);
        printSalaries(users);
    }

    private static void printSalaries(List<User> users) {
        for (User user : users) {
            /*
             * Any parent class should be able to substituted by Child class without extra
             * conditions, if followed this principle Volunteer shouldn't extend the
             * User Parent class.
             */
            if (user instanceof Volunteer)
                System.out.println("Volunteer can't have salary");
            else
                System.out.println(user.getSalary());
        }
    }
}
