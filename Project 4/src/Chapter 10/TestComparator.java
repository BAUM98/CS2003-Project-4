import java.util.*;

class TestComparator {

  public static void main(String args[]) {
    NameComparator nameComp = new NameComparator();
    AgeComparator ageComp = new AgeComparator();

    Person[] p = new Person[5];
    p[0] = new Person("Michael", 15);
    p[1] = new Person("Mimi", 9);
    p[2] = new Person("Sarah", 12);
    p[3] = new Person("Andrew", 15);
    p[4] = new Person("Mark", 12);
    List<Person> l = Arrays.asList(p);

    System.out.println("Sorting by age:");
    Collections.sort(l, ageComp);
    System.out.println(l + "\n");

    System.out.println("Sorting by name:");
    Collections.sort(l, nameComp);
    System.out.println(l + "\n");

    System.out.println("Now sorting by age, after sorting by name:");
    Collections.sort(l, ageComp);
    System.out.println(l);
  } // end main

} // end TestComparator