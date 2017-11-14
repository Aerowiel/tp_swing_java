package utilities;

public class StringLabeledTextField extends LabeledTextField<String> {

    public StringLabeledTextField(String label, Integer size) {
        super(label, size);
        getTextField().addActionListener(e -> validateValue());
    }

    @Override
    public void validateValue() {

    }

    @Override
    public String getValue() {
        return getTextField().getText();
    }
}
