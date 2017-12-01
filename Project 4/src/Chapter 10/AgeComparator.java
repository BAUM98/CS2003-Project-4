import java.util.Comparator;
import java.io.Serializable;

class AgeComparator implements Comparator<Person>, Serializable {

public int compare(Person o1, Person o2) {
    // Returns the difference:
    // if positive, age of o1 person is greater than o2 person
    // if zero, the ages are equal
    // if negative, age of o1 person is less than o2 person
    return o1.getAge() - o2.getAge();
  } // end compare
   
  public boolean equals(Object obj) {
    // Simply checks to see if we have the same object  
    return this==obj;
  } // end equals
  
  private final static long serialVersionUID = 2006L;

} // end AgeComparator
