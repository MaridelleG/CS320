package Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private final Map<String, Contact> contacts = new HashMap<String, Contact>();
	
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getId())) {
			throw new IllegalArgumentException("Contact ID must be unique.");
		}
		contacts.put(contact.getId(), contact);
	}
	
	public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.remove(contactId);
    }
	
	 public void updateContact(String Id, String firstName, String lastName, String phoneNumber, String address) {
	        Contact contact = contacts.get(Id);
	        if (contact == null) {
	            throw new IllegalArgumentException("Contact ID not found.");
	        }
	        if (firstName != null) contact.setFirstName(firstName);
	        if (lastName != null) contact.setLastName(lastName);
	        if (phoneNumber != null) contact.setPhone(phoneNumber);
	        if (address != null) contact.setAddress(address);
	    }

	    public Contact getContact(String contactId) {
	        return contacts.get(contactId);
	    }
	}