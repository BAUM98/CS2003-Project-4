import java.util.*;

class CollectionsSortTest {
  public static void main(String args[]) {
    String[] names = {"Janet", "Michael", "Jack", "Nancy", 
                      "Andrew", "Sarah", "Mark", "Mimi"}; 
    List<String> l = Arrays.asList(names);
    Collections.sort(l);
    System.out.println(l);
  } // end main

} // end CollectionsSortTest