package gui;

import app.Employee;
import app.Staff;

import javax.swing.*;
import java.util.List;

public class ListEmployeeMenu extends JPanel {

    public ListEmployeeMenu(View view){

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JScrollPane scrollPane = new JScrollPane(generateJTableFromEmployees());
        add(scrollPane);

        JLabel averageSalary = new JLabel("Average Salary = " + Staff.getInstance().averageSalary());
        add(averageSalary);

        JLabel totalSalary = new JLabel("Total Salary = " + Staff.getInstance().totalSalary());
        add(totalSalary);

        JButton buttonOpenMainMenu = new JButton("Return to Menu");
        add(buttonOpenMainMenu);

        buttonOpenMainMenu.addActionListener(e -> view.openMainMenu());
    }

    public JTable generateJTableFromEmployees(){
        List<Employee> employeesList =  Staff.getInstance().getEmployees();
        Object[][] employeesArray = new Object[employeesList.size()][];
        for(int i = 0; i < employeesList.size(); i++){

            Employee employee = employeesList.get(i);
            Object[] employeeArray = new Object[]{employee.firstname, employee.lastname, employee.age, employee.dateOfEntry, employee.calculateSalary()};
            employeesArray[i] = employeeArray;
        }

        Object columnNames[] = { "Firstname", "Lastname", "Age", "Date of Entry" , "Salary"};
        return new JTable(employeesArray, columnNames);
    }
}
