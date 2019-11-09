package day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTask10CompareTwoH {
    public static void main(String[] args) {
        HashSet<String> colorsList1=new HashSet<String>();
        colorsList1.add("Black");
        colorsList1.add("Blue");
        colorsList1.add("Pink");
        colorsList1.add("Purple");

        HashSet<String> colorsList2=new HashSet<String>();
        colorsList2.add("Black");
        colorsList2.add("Blue");
        colorsList2.add("Pink");
        colorsList2.add("Red");

        HashSet<String>result=new HashSet<String>();
        for (String s : colorsList1) {
            System.out.println(colorsList2.contains(s)?"Yes":"No");
        }

    }
}
