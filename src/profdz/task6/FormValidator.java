package profdz.task6;

import java.time.LocalDate;



public class FormValidator {


    public static void main(String[] args) throws Exception {
        String name = "Maksim";
        String gen = "MALE";
        String height = "192";
        String birthDate = "1999 3 12";
        checkName(name);
        checkBirthdate(birthDate);
        checkGender(gen);
        checkHeight(height);

    }

    public static void checkName(String name) {

        int nameLength = name.length();
        try {
            if (nameLength > 2 && nameLength < 20) {
                System.out.println("The name is valid: "+ name);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("The name is not valid");
        }

    }

    public static void checkBirthdate(String date) throws Exception {
        LocalDate start = LocalDate.of(1900, 1, 1);
        LocalDate stop = LocalDate.of(2022, 11, 13);
        LocalDate dateForCheck = LocalDate.of(1999, 3, 12);

        try {
            if (dateForCheck.isAfter(start) && dateForCheck.isBefore(stop)) {
                System.out.println("The date of the Birthday is valid: " + dateForCheck);
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            throw new Exception("The date is not valid");
        }
    }


    public enum Gender {MALE, FEMALE}

    public static void checkGender(String gen) throws Exception {
        Gender[] allGend = Gender.values();
        try {
            for (Gender d : allGend) {
                if (d.name().equals(gen)) {
                    System.out.println("The gender is valid: " + d.name());
                    break;
                }
                throw new Exception();
            }

        } catch (Exception e) {
            throw new Exception("Gender is not valid " + e);
        }
    }

    public static void checkHeight(String heightStr) throws Exception {
        int height = Integer.parseInt(heightStr);
        try {
            if ((double) height > 0) {
                System.out.println("The height is valid: " + (double) height);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception("The height is not valid");
        }
    }
}
