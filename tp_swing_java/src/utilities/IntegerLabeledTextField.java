package utilities;


public class IntegerLabeledTextField extends LabeledTextField<Integer> {
    public IntegerLabeledTextField(String label, Integer size) {
        super(label, size);
        getTextField().addActionListener(e -> validateValue());
    }

    @Override
    public void validateValue() {

    }

    @Override
    public Integer getValue() {
        return Integer.valueOf(getTextField().getText());
    }
}
