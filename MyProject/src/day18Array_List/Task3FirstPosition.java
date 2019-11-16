package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task3FirstPosition {
//    Write a Java program to insert an element into the array list at the first position.
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("red");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    System.out.println("first:"+list);
    list.add(0,"orange");
    System.out.println("after:"+list);
}
}
