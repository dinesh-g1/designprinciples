package singleresponsibility.singleresponsible;

public class SalaryCalculator {

    public void calculateSalary(SingleResponsibleEmployee employee) {
        switch (employee.getRoleType()) {
            case Constants.MANAGER -> System.out.println("Manager salary calculation");
            case Constants.ARCHITECT -> System.out.println("Architect salary calculation");
            case Constants.LEAD -> System.out.println("Lead salary calculation");
        }
    }
}
