package homework.day18Arraylist;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10Shuffle {
    //10. Write a Java program to shuffle elements in a array list.[advanced]
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before shuffling:\n" + list_Strings);
        Collections.shuffle(list_Strings);
        System.out.println("List after shuffling:\n" + list_Strings);
    }
}
