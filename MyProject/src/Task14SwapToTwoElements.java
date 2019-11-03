package day19.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Task14SwapToTwoElements {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Purple");

        System.out.println("\nBefore swap");
        for (String color : colors) {
            System.out.println(color);
        }
        Collections.swap(colors,0,2);
        System.out.println("\nAfter Swap");
        for (String s : colors) {
            System.out.println(s);
        }

    }
}
