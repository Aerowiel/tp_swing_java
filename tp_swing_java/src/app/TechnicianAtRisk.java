package app;

public class TechnicianAtRisk extends Technician implements IAtRisk {

    public TechnicianAtRisk(String firstname, String lastname, int age, String dateOfEntry, double productedUnite) {
        super(firstname, lastname, age, dateOfEntry, productedUnite);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + getPrime();
    }

    @Override
    public double getPrime() {
        return 200;
    }
}
