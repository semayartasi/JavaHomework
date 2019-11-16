package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8Sort {
//    Write a Java program to sort a given array list.
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("yellow");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    System.out.println("before sort:"+list);
    Collections.sort(list);
    System.out.println("After sort:"+list);
}
}
