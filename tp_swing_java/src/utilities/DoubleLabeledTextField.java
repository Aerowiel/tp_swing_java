package utilities;

public class DoubleLabeledTextField extends LabeledTextField<Double> {

    public DoubleLabeledTextField(String labelName, Integer size) {
        super(labelName, size);
        getTextField().addActionListener(e -> validateValue());
    }

    @Override
    public void validateValue() {

    }

    @Override
    public Double getValue() {
        return Double.parseDouble(getTextField().getText());
    }


}
