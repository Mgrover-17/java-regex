package com.bridgelabz.junit.advanced;

import com.junit.advanced.UserRegistration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        Assertions.assertDoesNotThrow(() -> {
            registration.registerUser("manvi", "manvi@example.com", "Strong@123");
        });
    }

    @Test
    void testEmptyUsername() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "manvi@example.com", "Strong@123");
        });
    }

    @Test
    void testInvalidEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("manvi", "manvi.example.com", "Strong@123");
        });
    }

    @Test
    void testWeakPassword() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("manvi", "manvi@example.com", "12345");
        });
    }

    @Test
    void testNullInputs() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
