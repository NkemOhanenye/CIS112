/**
  * User: Nkem Ohanenye
  * Date: 2/20/18
  * Purpose: to check the added methods to the two collections
  */
package Lab5;

public class LinkedCollection_Driver {

    public static void main (String args[]){
        LinkedCollection<String> test = new LinkedCollection<String>();
        test.add("ningen");
        test.add("heero");
        test.add("ningen");
        System.out.println(test.toString());
        System.out.println(test.count(""));
        System.out.println("----------------------------------------------------------");
        test.removeAll("ningen");
        System.out.println(test.toString());
        System.out.println(test.count(""));
        System.out.println("----------------------------------------------------------");
        SortedArrayCollection<Integer> test2 = new SortedArrayCollection<Integer>();
        SortedArrayCollection<Integer> test3 = new SortedArrayCollection<Integer>();
        test2.add(1);
        test2.add(3);
        test3.add(4);
        test3.add(5);
        System.out.println(test2.toString());
        System.out.println(test2.combine(test3).toString());

    }
}