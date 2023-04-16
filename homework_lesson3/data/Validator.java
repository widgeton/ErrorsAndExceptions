package data;

import java.time.Year;

public class Validator {
    public boolean isNameValid(String input) {
        String[] name = input.split(" ");
        return name.length == 3;
    }

    public boolean isBirthdateValid(String input) {
        String[] birthdate = input.split("\\.");
        if (birthdate.length != 3) return false;

        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            int num;
            try {
                num = Integer.parseInt(birthdate[i]);
            } catch (NumberFormatException e) {
                return false;
            }
            nums[i] = num;
        }
        if (nums[0] > 31 || nums[0] < 0) return false;
        if (nums[1] > 12 || nums[1] < 0) return false;
        return nums[2] <= Year.now().getValue() && nums[2] >= 0;
    }

    public boolean isPhoneNumberValid(String input) {
        if (input.length() != 11) return false;
        String[] array = input.split("(?!^)");
        for (String symbol : array) {
            try {
                Integer.parseInt(symbol);
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

    public boolean isGenderValid(String input) {
        return input.equals("f") || input.equals("m");
    }
}
