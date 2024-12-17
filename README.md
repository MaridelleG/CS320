# CS320

How can I ensure that my code, program, or software is functional and secure?

To ensure that my code, program, or software is functional and secure, I rely on thorough testing and secure coding practices. For example, in the Contact class, I implemented validation checks to ensure that the first name is not null and does not exceed a specified length, and that the phone number meets the expected format. To test these constraints, I created unit tests using JUnit that checked both valid and invalid inputs. For instance, I tested cases where a contact's first name was null or longer than the allowed length. This approach ensures that my program functions correctly and that potential errors are caught early. For security, I also avoid exposing sensitive information, such as phone numbers or personal identifiers, without proper encryption or access controls.

How do I interpret user needs and incorporate them into a program?

When interpreting user needs and incorporating them into a program, I focus on understanding the real-world problem and translating it into functional software requirements. In the Contact class, the user need was to store and manage contact information with certain constraints, like ensuring that no duplicate contact IDs exist and that fields like the first name and phone number are properly validated. By engaging with the requirements, I was able to design the class to meet these expectations. For example, I incorporated logic to check for duplicate contact IDs and enforce constraints on the length of the first name and phone number. This ensures that the software is built around user needs and can handle the expected use cases.

How do I approach designing software?

When designing software, I approach it with simplicity, scalability, and maintainability in mind. In the case of the Contact class, I started by modeling the core features such as the ability to store contact information, validate constraints, and ensure uniqueness—before expanding to more complex features. The design followed object-oriented principles, where each contact is an object with its own attributes and methods. For instance, I used getter methods to access the contact's information, ensuring that the class maintained a clear structure. I also considered potential future requirements, like adding additional fields for contacts or integrating the class with other services, and kept the design flexible enough to accommodate these changes without significant refactoring.
