package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task6RemoveElement {
//    Write a Java program to remove the third element from a array list.
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("red");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    System.out.println(list);
    list.remove(3);
    System.out.println(list);
}
}
