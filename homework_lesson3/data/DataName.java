package data;

public class DataName extends Data {

    protected DataName(Output output, Validator validator, Person person) {
        super(output, validator, person);
    }

    @Override
    public void set(String input) {
        person.setName(input);
    }

    @Override
    public void showQueryOutput() {
        output.queryName();
    }

    @Override
    public void showFailedInput() {
        output.failedName();
    }

    @Override
    public boolean isValid(String input) {
        checkExit(input);
        return validator.isNameValid(input);
    }
}
