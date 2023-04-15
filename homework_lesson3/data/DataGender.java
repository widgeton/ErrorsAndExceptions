package data;

public class DataGender extends Data {

    protected DataGender(Output output, Validator validator, Person person) {
        super(output, validator, person);
    }

    @Override
    public void set(String input) {
        person.setGender(input);
    }

    @Override
    public void showQueryOutput() {
        output.queryGender();
    }

    @Override
    public void showFailedInput() {
        output.failedGender();
    }

    @Override
    public boolean isValid(String input) {
        checkExit(input);
        return validator.isGenderValid(input);
    }
}
