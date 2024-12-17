package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertEquals(contact, contactService.getContact("1234567890"));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.deleteContact("1234567890");
        assertNull(contactService.getContact("1234567890"));
    }
    
    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
    }
    
    @Test
    public void testUpdateLastName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setLastName("David");
        assertEquals("David", contact.getLastName());
    }

    @Test
    public void testUpdateAddress() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setAddress("125 Main St");
        assertEquals("125 Main St", contact.getAddress());
    }
    
    @Test
    public void testUpdatePhoneNumber() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setPhone("1253685183");
        assertEquals("1253685183", contact.getPhone());
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        
        contactService.updateContact("1234567890", "Jane", "Smith", "0987654321", "456 Elm St");
        
        Contact updatedContact = contactService.getContact("1234567890");
        assertEquals("Jane", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("456 Elm St", updatedContact.getAddress());
    }
}