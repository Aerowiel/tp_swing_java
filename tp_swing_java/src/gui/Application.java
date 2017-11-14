package gui;

import static javax.swing.SwingUtilities.invokeLater;

public class Application {
    public static void main(String[] args){
        invokeLater(Application::window);
    }

    private static void window(){

        View view = new View();
    }

}
