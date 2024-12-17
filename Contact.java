package Contact;

public class Contact {
	private final String Id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String Id, String firstName, String lastName, String phoneNumber, String address) {
		super();
		 if (Id == null || Id.length() > 10) {
	            throw new IllegalArgumentException("Contact ID must be non-null and no longer than 10 characters.");
	        }
	        if (firstName == null || firstName.length() > 10) {
	            throw new IllegalArgumentException("First name must be non-null and no longer than 10 characters.");
	        }
	        if (lastName == null || lastName.length() > 10) {
	            throw new IllegalArgumentException("Last name must be non-null and no longer than 10 characters.");
	        }
	        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
	            throw new IllegalArgumentException("Phone must be non-null and exactly 10 digits.");
	        }
	        if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Address must be non-null and no longer than 30 characters.");
	        }
	        
	        this.Id = Id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	    }
	 public String getId() {
	        return Id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        if (firstName == null || firstName.length() > 10) {
	            throw new IllegalArgumentException("First name must be non-null and no longer than 10 characters.");
	        }
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        if (lastName == null || lastName.length() > 10) {
	            throw new IllegalArgumentException("Last name must be non-null and no longer than 10 characters.");
	        }
	        this.lastName = lastName;
	    }

	    public String getPhone() {
	        return phoneNumber;
	    }

	    public void setPhone(String phone) {
	        if (phone == null || !phone.matches("\\d{10}")) {
	            throw new IllegalArgumentException("Phone must be non-null and exactly 10 digits.");
	        }
	        this.phoneNumber = phone;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Address must be non-null and no longer than 30 characters.");
	        }
	        this.address = address;
	    }
	}
