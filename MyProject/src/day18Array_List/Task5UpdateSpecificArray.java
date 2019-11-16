package homework.day18Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task5UpdateSpecificArray {
//    Write a Java program to update specific array element by given element.
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("gray");
        list.add("purple");
        System.out.println(list);
        System.out.println("updated list element:"+list.set(0,"yellow"));
        System.out.println(list);

    }
}
