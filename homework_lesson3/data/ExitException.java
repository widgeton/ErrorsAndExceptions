package data;

public class ExitException extends RuntimeException {
    public ExitException() {
        super("Пользователь ввел команду выхода");
    }
}
