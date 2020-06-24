package collections;

import java.util.*;

public class CollectionExample {


    public static void main(String[] args){

        // Collection is an interface, it is the top of the tree
      Collection values = new ArrayList();

      // we add values
        values.add(8);
        values.add(4);
        values.add(1);
        values.add(10);

      // we print them using an iterator
        Iterator valuesIterator  = values.iterator();
       while(valuesIterator.hasNext()){
           System.out.println(valuesIterator.next());
       }


        ////////////////////  List has more functions than Collection
       ///////////////////////////////////////////////////////////////////////
        List values1 = new ArrayList(); // when we dont specify the types List look at the element as objects

        // we add values
        values1.add(8); // 8 here is not int 8 , but it is Integer v = new Integer(8),  it is an object
        values1.add(4);
        values1.add(1);
        values1.add(10);
        values1.add("hello"); // as you see list support all type  of values, because list look at them as objects

        // in List we could loop normally because the list works with arrays
        for (int i = 0 ; i < values1.size(); i++){
          System.out.println("=> "+values1.get(i));
       }

        // since we found that List look at them as  objects,  we can loop in it via the objects for loop
        for (Object o : values1){
            System.out.println("==> "+ o);
        }



        ///////////// Collections is a class and it is different then Collection (interface)
       ///////////////////////////////////////////////////////////////////////////

        List<Integer> values2 = new ArrayList<>(); // when we  specify the types List look at the element as in

        // we add values
        values2.add(20); // 8 here is not int 8 , but it is Integer v = new Integer(8),  it is an object
        values2.add(40);
        values2.add(10);
        values2.add(23);

        Collections.sort(values2); // it is class does the sorting
        // in List we could loop normally because the list works with arrays
        for (int i = 0 ; i < values2.size(); i++){
            System.out.println("===> "+values2.get(i));
        }

        // since we found that List look at them as  objects as well ,  we can loop in it via the objects for loop
        for (Object o : values2){
            System.out.println("====> "+ o);
        }







    }
}
