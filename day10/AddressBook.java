import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static Scanner sc = new Scanner(System.in);
    private List<Contact> addressBook = new ArrayList<>();

	public void showOptions(){
		System.out.println("1. Add Contact" +
                    "\n2. Edit Contact" +
                    "\n3. Delete Contact" +
                    "\n4. Show Address Book" +
                    "\n5. Exit" +
                    "\nEnter Option:");
		
	}
	public void addContact() {
		Contact c_obj = new Contact();
        this.setAttributes(c_obj);
        addressBook.add(c_obj);
    }
	public void setAttributes(Contact c_obj){
		
		System.out.print("Enter First Name: ");
		c_obj.firstName = sc.next();
        System.out.print("Enter Last Name: ");
        c_obj.lastName = sc.next();
        System.out.print("Enter address: ");
        c_obj.address = sc.next();
        System.out.print("Enter City: ");
        c_obj.city = sc.next();
        System.out.print("Enter State: ");
        c_obj.state = sc.next();
        System.out.print("Enter Zip:");
        c_obj.zip = sc.nextLong();
        System.out.print("Enter Phone Number:");
        c_obj.phoneNumber = sc.nextLong();
		System.out.print("Enter E-Mail:");
        c_obj.email = sc.next();
	}
    public void editContact() {
        System.out.print("Please Enter Name: ");
        String name = sc.next();
        Contact contact = findContact(name);
        if (contact != null) {
            this.setAttributes(contact);
        }
        else {
            System.out.println("No contact found with the entered name");
        }
    }
    public void deleteContact() {
        System.out.print("Enter Name:");
        String name = sc.next();
        Contact contact = this.findContact(name);
        if (contact != null) {
            System.out.println("Found the entry and removing");
            addressBook.remove(contact);
        }
        else {
            System.out.println("No contact found");
        }
    }
    public void showContacts() {
        for(int i = 0; i < addressBook.size(); i++) {
            System.out.println(addressBook.get(i));
        }
    }
    public Contact findContact(String name){
        Contact contact = null;
        for(int i = 0; i < addressBook.size(); i++) {
            if(name.equals(addressBook.get(i).getFirstName())
                || name.equals(addressBook.get(i).getLastName())) {
                break;
            }
        }
        return contact;
    }
	public void manageContacts(){
		boolean isContinue = true;
		while(isContinue){
			this.showOptions();
            int option = sc.nextInt();
			switch (option) {
				case 1:
					this.addContact();
					break;
				case 2:
					this.editContact();
					break;
				case 3:
					this.deleteContact();
					break;
				case 4:
					this.showContacts();
					break;
				case 5:
					isContinue = false;
					System.out.println("Exit");
                    break;
				default:
					System.out.println("Please Enter Valid Input");
			}
		}
	}
    public static void main(String[] args) {
        AddressBook ledger = new AddressBook();
        ledger.manageContacts();
    }
}