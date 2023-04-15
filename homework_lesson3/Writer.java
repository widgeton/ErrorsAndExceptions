import data.Person;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private final Person person;

    public Writer(Person person) {
        this.person = person;
    }

    public void writeInCsv() {
        try (FileWriter fileWriter = new FileWriter("%s.csv".formatted(getSecondName()))) {
            fileWriter.write(person.toString());
            person.getOutput().successfulRecording();
        } catch (IOException ex) {
            person.getOutput().failedRecording();
        }
    }

    private String getSecondName() {
        return person.getName().split(" ")[0];
    }
}
