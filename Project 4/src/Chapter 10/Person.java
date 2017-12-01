import java.io.Serializable;

class Person implements Serializable {
  private String name;
  private int age;
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  } // end constructor
  
  public String getName() {
    return name;
  } // end getName
  
  public int getAge() {
    return age;
  } // end getAge

  public String toString() {
   return name + " - " + age;
  } // end toString
  
  private final static long serialVersionUID = 2006L;
} //end Person
