package gui;

import java.awt.*;
import javax.swing.*;

public class View extends JFrame {

    private MainMenu mainMenu;
    private ListEmployeeMenu listEmployeeMenu;
    private CreateEmployeeMenu createEmployeeMenu;


    public View(){
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);

        openMainMenu();

    }

    public void openCreateEmployeeMenu() {
        createEmployeeMenu = new CreateEmployeeMenu(this);

        this.getContentPane().removeAll();
        this.add(createEmployeeMenu);
        this.revalidate();
        this.repaint();
        this.setTitle("Create Employee");
    }

    public void openListEmployeeMenu(){
        listEmployeeMenu = new ListEmployeeMenu(this);

        this.getContentPane().removeAll();
        this.add(listEmployeeMenu);
        this.revalidate();
        this.repaint();
        this.setTitle("Open employee list");

    }

    public void openMainMenu(){
        mainMenu = new MainMenu(this);

        this.getContentPane().removeAll();
        this.add(mainMenu);
        this.revalidate();
        this.repaint();

        this.setVisible(true);

        this.setTitle("Open Main Menu");
    }

}
