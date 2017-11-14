package app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Staff implements Serializable {

    private static Staff instance;
    private List<Employee> employees = new ArrayList<>();
    private static String[] classes = { Vendor.class.getName(),
                                        Representative.class.getName(),
                                        Technician.class.getName(),
                                        Warehouseman.class.getName(),
                                        TechnicianAtRisk.class.getName(),
                                        WarehousemanAtRisk.class.getName()};



    public void addEmployee(Employee e){
        employees.add(e);
        System.out.println(employees.size());
    }

    public double totalSalary(){
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.calculateSalary();
        }
        return totalSalary;
    }

    public double averageSalary(){
        double totalSalary = 0;
        int numberOfEmployee = employees.size();
        for (Employee emp : employees) {
            totalSalary += emp.calculateSalary();
        }
        return totalSalary / numberOfEmployee;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public void createEmployee(int choice, Object[] attributes){

        try {
            Employee e = (Employee) Class.forName(classes[choice])
                    .getConstructor(String.class, String.class, int.class, String.class, double.class)
                    .newInstance((String)attributes[0], (String)attributes[1], (int)attributes[2], (String)attributes[3], (Double)attributes[4]);
            addEmployee(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Staff getInstance(){
        if(instance == null){
            instance = new Staff();
        }
        return instance;
    }

}
