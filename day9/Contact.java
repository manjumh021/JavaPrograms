public class Contact {

    private String name; // Stores name of Contact
    private int age;  // Stores age of Contact
    private long phonenumber; // Stores phone number of contact
    private int bday;  // Stores birthday in an int

    // Creates Contact object based on parameters.
    public Contact(String n, int a, long p, int month, int day) {
      name = n;
      age = a;
      phonenumber = p;
      bday = 100*month + day;
    }

    // Changes phone number of contact
    public void changeNumber(long newnum) {
		  phonenumber = newnum;
    }

    // Returns the name of a Contact
    public String getName() {
		  return name;
    }

    // Returns the age of a Contact
    public int getAge() {
		  return age;
    }

    // Returns the phone number of a Contact
    public long getNumber() {
		  return phonenumber;
    }

    // Prints all information about a contact out.
    public void printContact() {
      System.out.print("Name: " + name + " Age: " + age + " Phone#: " + phonenumber);
      System.out.println(" Birthday: " + getBdayMonth() + "/" + getBdayDay());
    }

    // Returns month of Contact's birthday
    public int getBdayMonth() {
		  return bday/100;
    }
    
    // Returns day of the month of Contact's birthday
    public int getBdayDay() {
		  return bday%100;
    }

}