package utilities;

import javax.swing.*;

public abstract class LabeledTextField<T> extends JPanel {

    private JTextField textField;
    private JLabel label;

    public LabeledTextField(String labelName, Integer size) {
        label = new JLabel(labelName);
        textField = new JTextField(size);
        add(label);
        add(textField);
    }

    public abstract T getValue();

    public JTextField getTextField() {
        return textField;
    }

    public void validateValue(){

    }
}