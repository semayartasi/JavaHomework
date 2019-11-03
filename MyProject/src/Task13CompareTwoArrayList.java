package day19.homework;

import java.util.ArrayList;

public class Task13CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorsList1=new ArrayList<String>();
        colorsList1.add("Black");
        colorsList1.add("Blue");
        colorsList1.add("Pink");
        colorsList1.add("Purple");

        ArrayList<String> colorsList2=new ArrayList<>();
        colorsList2.add("Black");
        colorsList2.add("Blue");
        colorsList2.add("Pink");
        colorsList2.add("Red");

        ArrayList<String> compare=new ArrayList<String>();
        for (String s : colorsList1)
            compare.add(colorsList2.contains(s)?"Yes":"No");
            System.out.println(compare);

    }

}
