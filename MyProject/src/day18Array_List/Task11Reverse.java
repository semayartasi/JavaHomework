package homework.day18Arraylist;


import java.util.ArrayList;
import java.util.Collections;

public class Task11Reverse {
   // Write a Java program to reverse elements in a array list.
   public static void main(String[] args) {
  ArrayList<String> list_Strings = new ArrayList<>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  System.out.println("List before reversing :\n" + list_Strings);
  Collections.reverse(list_Strings);
  System.out.println("List after reversing :\n" + list_Strings);
}

}
