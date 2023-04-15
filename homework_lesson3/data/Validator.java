package data;

import java.util.List;

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
        if (nums[2] > 2023 || nums[2] < 0) return false;
        return true;
    }

    public boolean isPhoneNumberValid(String input) {
        if (input.length() != 15) return false;
        String[] array = input.split("-");
        for (String symbol : array) {
            try {
                int n = Integer.parseInt(symbol);
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

    public boolean isGenderValid(String input) {
        if (input.equals("f") || input.equals("m")) return true;
        return false;
    }
}
