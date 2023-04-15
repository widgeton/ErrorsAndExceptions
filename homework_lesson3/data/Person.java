package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Person implements Iterator<Data> {
    private String name;
    private String birthdate;
    private String phoneNumber;
    private String gender;

    private final List<Data> data;
    private int cursor;
    private final Output output;


    public Person(Output output, Validator validator) {
        this.output = output;
        this.data = new ArrayList<>(Arrays.asList(
                new DataName(output, validator, this),
                new DataBirthdate(output, validator, this),
                new DataPhoneNumber(output, validator, this),
                new DataGender(output, validator, this)));
    }


    public Output getOutput() {
        return output;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s;%s;%s;%s".formatted(name, birthdate, phoneNumber, gender);
    }

    @Override
    public boolean hasNext() {
        return cursor < data.size();
    }

    @Override
    public Data next() {
        return data.get(cursor++);
    }
}
