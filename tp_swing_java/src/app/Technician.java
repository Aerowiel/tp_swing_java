package app;

public class Technician extends Employee {

    private double productedUnite;

    public Technician(String firstname, String lastname, int age, String dateOfEntry, double productedUnite) {
        super(firstname, lastname, age, dateOfEntry);
        this.productedUnite = productedUnite;
    }

    @Override
    public double calculateSalary() {
        salary = productedUnite * 5;
        return salary;
    }

}
