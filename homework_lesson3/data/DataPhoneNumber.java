package data;

public class DataPhoneNumber extends Data {

    protected DataPhoneNumber(Output output, Validator validator, Person person) {
        super(output, validator, person);
    }

    @Override
    public void set(String input) {
        person.setPhoneNumber(input);
    }

    @Override
    public void showQueryOutput() {
        output.queryPhoneNumber();
    }

    @Override
    public void showFailedInput() {
        output.failedPhoneNumber();
    }

    @Override
    public boolean isValid(String input) {
        checkExit(input);
        return validator.isPhoneNumberValid(input);
    }
}
