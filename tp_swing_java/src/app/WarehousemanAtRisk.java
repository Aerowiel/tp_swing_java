package app;

public class WarehousemanAtRisk extends Warehouseman implements IAtRisk {


    public WarehousemanAtRisk(String firstname, String lastname, int age, String dateOfEntry, double monthlyHour) {
        super(firstname, lastname, age, dateOfEntry, monthlyHour);
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
