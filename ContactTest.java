package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Contact.Contact;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testInvalidContactIdTooLong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
        });
        assertEquals("Contact ID must be non-null and no longer than 10 characters.", exception.getMessage());
    }

    @Test
    public void testNullFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", null, "Doe", "1234567890", "123 Main St");
        });
        assertEquals("First name must be non-null and no longer than 10 characters.", exception.getMessage());
    }

    @Test
    public void testInvalidPhoneNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "12345", "123 Main St");
        });
        assertEquals("Phone must be non-null and exactly 10 digits.", exception.getMessage());
    }

    @Test
    public void testInvalidAddressTooLong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Some City, Some State");
        });
        assertEquals("Address must be non-null and no longer than 30 characters.", exception.getMessage());
    }

    @Test
    public void testUpdateInvalidFirstName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });
        assertEquals("First name must be non-null and no longer than 10 characters.", exception.getMessage());
    }
    
    @Test
    public void testUpdateInvalidLastName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });
        assertEquals("Last name must be non-null and no longer than 10 characters.", exception.getMessage());
    }
}