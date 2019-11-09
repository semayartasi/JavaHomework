package day19_HashSet;

import java.util.ArrayList;

public class Task15JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors1=new ArrayList<String>();
        colors1.add("Black");
        colors1.add("Blue");
        colors1.add("Purple");
        colors1.add("Pink");

        ArrayList<String> colors2=new ArrayList<String>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Yellow");
        colors2.add("White");

        ArrayList<String> joinColors=new ArrayList<String>();
        joinColors.addAll(colors1);
        joinColors.addAll(colors2);
        System.out.println("New Array:"+joinColors);

    }
}
