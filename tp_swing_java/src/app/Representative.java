package app;

public class Representative extends Employee {

    private double turnover;

    public Representative(String firstname, String lastname, int age, String dateOfEntry, double turnover) {
        super(firstname, lastname, age, dateOfEntry);
        this.turnover = turnover;
    }

    @Override
    public double calculateSalary() {
        salary = (turnover * 0.20) + 800;
        return salary;
    }

}
