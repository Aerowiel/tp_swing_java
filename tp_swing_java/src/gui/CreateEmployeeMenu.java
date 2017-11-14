package gui;

import app.Staff;
import utilities.*;

import javax.swing.*;
import java.awt.*;

public class CreateEmployeeMenu extends JPanel {

    private String[] employeeTypes =  { "Vendor",
                                        "Representative",
                                        "Technician",
                                        "Warehouseman",
                                        "TechnicianAtRisk",
                                        "WarehousemanAtRisk" };


    public CreateEmployeeMenu(View view){

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JPanel FieldsContainer = new JPanel();
        FieldsContainer.setLayout(new GridLayout(0, 1));

        JPanel buttonsContainer = new JPanel();
        buttonsContainer.setLayout(new GridLayout(0, 2));

        this.add(FieldsContainer);
        this.add(buttonsContainer);

        StringLabeledTextField firstname = new StringLabeledTextField("First Name", 10);
        FieldsContainer.add(firstname);

        StringLabeledTextField lastname = new StringLabeledTextField("Last Name", 10);
        FieldsContainer.add(lastname);

        IntegerLabeledTextField age = new IntegerLabeledTextField("Age", 10);
        FieldsContainer.add(age);

        StringLabeledTextField date = new StringLabeledTextField("Date of Entry", 10);
        FieldsContainer.add(date);

        DoubleLabeledTextField currency = new DoubleLabeledTextField("Currency", 10);
        FieldsContainer.add(currency);

        StringLabeledComboBox employeeType = new StringLabeledComboBox("Employee type", employeeTypes);
        FieldsContainer.add(employeeType);

        JButton buttonCreateEmployee = new JButton("Add Employee");
        buttonsContainer.add(buttonCreateEmployee);
        JButton buttonOpenMainMenu = new JButton("Return to Menu");
        buttonsContainer.add(buttonOpenMainMenu);

        buttonCreateEmployee.addActionListener(e -> callCreateEmployee(employeeType.getSelectedIndex(),firstname.getValue(),
                lastname.getValue(),
                age.getValue(),
                date.getValue(),
                currency.getValue())
        );
        buttonOpenMainMenu.addActionListener(e -> view.openMainMenu());
    }

    public void callCreateEmployee(Integer choice,String firstname, String lastname, Integer age, String date, Double currency){
        Staff.getInstance().createEmployee(choice, new Object[]{firstname, lastname, age, date, currency});
    }
}
