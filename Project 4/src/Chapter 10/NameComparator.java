import java.util.Comparator;
import java.io.Serializable;

class NameComparator implements Comparator<Person>, Serializable {

public int compare(Person o1, Person o2) {
    // Compares its two arguments for order by name. 
    return o1.getName().compareTo(o2.getName());
  } // end compare
   
  public boolean equals(Object obj) {
    // Simply checks to see if we have the same object  
    return this==obj;
  } // end equals
  
  private final static long serialVersionUID = 2006L;
} // end NameComparator
