package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
//     Write a Java program to iterate through all elements in a array list
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("red");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    for (String s : list) {
        System.out.println(s);

    }
}
}
