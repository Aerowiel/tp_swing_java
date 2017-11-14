package app;

public class Vendor extends Employee {

    private double turnover;

    public Vendor(String firstname, String lastname, int age, String dateOfEntry, double turnover) {
        super(firstname, lastname, age, dateOfEntry);
        this.turnover = turnover;
    }

    @Override
    public double calculateSalary() {
        salary = (turnover * 0.20) + 400;
        return salary;

    }

}
