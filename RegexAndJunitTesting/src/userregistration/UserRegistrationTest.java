package userregistration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class RegistrationValidatorTest {

    private UserRegistrationUsingRegex registrationValidator;

    @BeforeEach
    void setup() {
        registrationValidator = new UserRegistrationUsingRegex();
        System.out.println("Setup before each test");
    }

    @Test
    void testValidFirstName() {
        assertDoesNotThrow(() -> registrationValidator.isValidFirstName("Kanika"));
    }

    @Test
    void testInvalidFirstName() {
        assertThrows(InvalidFirstNameException.class, () -> registrationValidator.isValidFirstName("k"));
    }


    @Test
    void testValidLastName() {
        assertDoesNotThrow(() -> registrationValidator.isValidLastName("Johnson"));
    }

    @Test
    void testInvalidLastName() {
        assertThrows(InvalidLastNameException.class, () -> registrationValidator.isValidLastName("arnav"));
        assertThrows(InvalidLastNameException.class, () -> registrationValidator.isValidLastName("J"));
    }

    @Test
    void testValidMobileNumber() {
        assertDoesNotThrow(() -> registrationValidator.isValidMobileNumber("+91 8765432109"));
    }

    @Test
    void testInvalidMobileNumber() {
        assertThrows(InvalidMobileNumberException.class, () -> registrationValidator.isValidMobileNumber("8765432109"));
        assertThrows(InvalidMobileNumberException.class, () -> registrationValidator.isValidMobileNumber("+91-8765432109"));
        assertThrows(InvalidMobileNumberException.class, () -> registrationValidator.isValidMobileNumber("+918765432109"));
    }

    @Test
    void testValidEmail() {
        assertDoesNotThrow(() -> registrationValidator.isValidEmail("michael.johnson@domain.com"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(InvalidEmailException.class, () -> registrationValidator.isValidEmail("michael.johnson@.com"));
        assertThrows(InvalidEmailException.class, () -> registrationValidator.isValidEmail("michael@com"));
        assertThrows(InvalidEmailException.class, () -> registrationValidator.isValidEmail("michael.johnson@@mail.com"));
    }

    @Test
    void testValidPassword() {
        assertDoesNotThrow(() -> registrationValidator.isValidPassword("Secure@123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(InvalidPasswordException.class, () -> registrationValidator.isValidPassword("secure123"));
        assertThrows(InvalidPasswordException.class, () -> registrationValidator.isValidPassword("SECURE123"));
        assertThrows(InvalidPasswordException.class, () -> registrationValidator.isValidPassword("Sec@1"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "user123@example.com",
            "alice.smith@work.org",
            "valid.email@service.net"
    })
    void testValidEmails_Parameterized(String email) {
        assertDoesNotThrow(() -> registrationValidator.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "wrong.email.com",
            "@missinguser.com",
            "user@.com",
            "user@domain..com",
            "user@domain,com"
    })
    void testInvalidEmails_Parameterized(String email) {
        assertThrows(InvalidEmailException.class, () -> registrationValidator.isValidEmail(email));
    }
}
