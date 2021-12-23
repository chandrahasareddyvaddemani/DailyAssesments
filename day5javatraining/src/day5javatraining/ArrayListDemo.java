package day5javatraining;

import java.util.ArrayList;
import java.util.List;
 
public class ArrayListDemo {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List list=new ArrayList();
        System.out.println(list.size() + " Before Adding Object");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        System.out.println(list.size() + " After Adding Object");
        System.out.println("First Object is "+list.get(1));
        System.out.println(list.remove(2)+" Index 2 Object has been deleted");
    }
 
}
