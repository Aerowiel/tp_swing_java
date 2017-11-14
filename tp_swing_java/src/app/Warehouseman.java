package app;

public class Warehouseman extends Employee {

    private double monthlyHour;

    public Warehouseman(String firstname, String lastname, int age, String dateOfEntry, double monthlyHour) {
        super(firstname, lastname, age, dateOfEntry);
        this.monthlyHour = monthlyHour;
    }

    @Override
    public double calculateSalary() {
        salary = monthlyHour * 65;
        return salary;
    }

}
