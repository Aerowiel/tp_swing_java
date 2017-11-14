package gui;

import javax.swing.*;


public class MainMenu extends JPanel {

    public MainMenu(View view){

        JButton buttonCreateEmployee = new JButton("Create Employee");
        buttonCreateEmployee.addActionListener(e -> view.openCreateEmployeeMenu());
        JButton buttonListEmployee = new JButton("List Employees");
        buttonListEmployee.addActionListener(e -> view.openListEmployeeMenu());

        this.add(buttonCreateEmployee);
        this.add(buttonListEmployee);
    }

}
