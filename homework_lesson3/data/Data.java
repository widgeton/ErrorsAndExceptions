package data;

public abstract class Data {
    protected final String EXIT = "ВЫХОД";
    protected final Validator validator;
    protected final Output output;
    protected final Person person;

    protected Data(Output output, Validator validator, Person person) {
        this.output = output;
        this.validator = validator;
        this.person = person;
    }

    public abstract void set(String input);

    public abstract void showQueryOutput();

    public abstract void showFailedInput();

    public abstract boolean isValid(String input);

    protected void checkExit(String input) {
        if (input.equals(EXIT)) throw new ExitException();
    }
}
