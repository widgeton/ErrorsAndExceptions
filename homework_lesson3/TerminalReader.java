import data.*;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final Validator validator;
    private final Output output;


    private TerminalReader() {
        this.validator = new Validator();
        this.output = new Output();
    }

    public static TerminalReader getInstance() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }

    public void listenToInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            output.start();
            Person person = new Person(output, validator);
            while (person.hasNext()) {
                Data data = person.next();
                while (true) {
                    data.showQueryOutput();
                    String input = scanner.nextLine();
                    if (data.isValid(input)) {
                        data.set(input);
                        break;
                    } else data.showFailedInput();
                }
            }
            Writer writer = new Writer(person);
            writer.writeInCsv();
        } catch (ExitException ex) {
            output.exit();
        }
    }
}
