package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9CopyArrayList {
//  Write a Java program to copy one array list into another.
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("yellow");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    System.out.println(list);

    List<String> list1=new ArrayList<>();
    list1.add("y");
    list1.add("b");
    list1.add("g");
    list1.add("p");
    System.out.println(list1);

    Collections.copy(list, list1);
    System.out.println("Copy List1 to List2,\nAfter copy:");
    System.out.println("List1: " + list);
    System.out.println("List2: " + list1);


}
}
