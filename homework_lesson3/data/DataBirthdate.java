package data;

public class DataBirthdate extends Data {

    protected DataBirthdate(Output output, Validator validator, Person person) {
        super(output, validator, person);
    }

    @Override
    public void set(String input) {
        person.setBirthdate(input);
    }

    @Override
    public void showQueryOutput() {
        output.queryBirthdate();
    }

    @Override
    public void showFailedInput() {
        output.failedBirthdate();
    }

    @Override
    public boolean isValid(String input) {
        checkExit(input);
        return validator.isBirthdateValid(input);
    }
}
