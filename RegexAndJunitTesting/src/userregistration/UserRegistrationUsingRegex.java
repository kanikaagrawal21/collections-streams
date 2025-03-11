package userregistration;

import java.util.Scanner;




// Custom Exception Classes

public class UserRegistrationUsingRegex {

    public boolean isValidFirstName(String firstName) throws InvalidFirstNameException {
        if (!firstName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidFirstNameException("Invalid First Name: It should start with a capital letter and have at least 3 letters.");
        }
        return true;
    }

    public boolean isValidLastName(String lastName) throws InvalidLastNameException {
        if (!lastName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidLastNameException("Invalid Last Name: It should start with a capital letter and have at least 3 letters.");
        }
        return true;
    }

    public boolean isValidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        if (!mobileNumber.matches("^\\+91\\s[0-9]{10}$")) {
            throw new InvalidMobileNumberException("Invalid Mobile Number: It should be in the format +91 XXXXXXXXXX");
        }
        return true;
    }

    public boolean isValidEmail(String email) throws InvalidEmailException {
        if (!email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}$")) {
            throw new InvalidEmailException("Invalid Email: Please enter a valid email format.");
        }
        return true;
    }

    public boolean isValidPassword(String password) throws InvalidPasswordException {
        if (!password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&()_+=]).{8,}$")) {
            throw new InvalidPasswordException("Invalid Password: Must be at least 8 characters long, contain at least one uppercase letter, one number, and one special character.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationUsingRegex validator = new UserRegistrationUsingRegex();

        try {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.println("Valid First Name: " + validator.isValidFirstName(firstName));
        } catch (InvalidFirstNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.println("Valid Last Name: " + validator.isValidLastName(lastName));
        } catch (InvalidLastNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Enter Mobile Number (with country code): ");
            String mobileNumber = scanner.nextLine();
            System.out.println("Valid Mobile Number: " + validator.isValidMobileNumber(mobileNumber));
        } catch (InvalidMobileNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.println("Valid Email: " + validator.isValidEmail(email));
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            System.out.println("Valid Password: " + validator.isValidPassword(password));
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
