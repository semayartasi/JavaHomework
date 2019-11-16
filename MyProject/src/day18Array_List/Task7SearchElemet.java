package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task7SearchElemet {
//    Write a Java program to search an element in a array list.
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("yellow");
    list.add("blue");
    list.add("gray");
    list.add("purple");
    System.out.println(list);

    if (list.contains("red")) {
    System.out.println("Found the element");
    }else {
        System.out.println("the element did not found");
    }
}}
