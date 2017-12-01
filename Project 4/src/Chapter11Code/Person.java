public class Person extends KeyedItem <FullName> {
  private String idNumber;
  private String phoneNumber;
  private Address address;

  public Person(String id, FullName name, 
                String phone, Address addr) { 
    super(name);
    idNumber = id; // idNumber declared as a private 
                   // data field
    phoneNumber = phone;
    address = addr;
    } // end constructor
  
  // other methods appear here
} // end Person

/*public class Person extends KeyedItem<String> {
  // inherits method getKey that returns the search key
  private FullName name;
  private String phoneNumber;
  private Address address;

  public Person(String id, FullName name, String phone,
                Address addr) {
    super(id);   // sets the key value to String id
    this.name = name;
    phoneNumber = phone;
    address = addr;
  }  // end constructor

  public String toString() {
    return getKey() + " # " + name;
  } // end toString

  // other methods would appear here
}  // end Person
*/