package utilities;


import javax.swing.*;

public abstract class LabeledComboBox<T> extends JPanel {
    private JTextField textField;
    private JComboBox<T> comboBox;
    private JLabel label;

    public LabeledComboBox(String labelName, T[] values){
        label = new JLabel(labelName);
        comboBox = new JComboBox<>(values);
        add(label);
        add(comboBox);
    }

    public int getSelectedIndex(){
        return comboBox.getSelectedIndex();
    }


}
