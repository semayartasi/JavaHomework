package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
//    Write a Java program to retrieve an element (at a specified index) from a given array list.
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("red");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    System.out.println(list);
    System.out.println("element 1:"+list.get(0));
}
}
