package day19_HashSet;

import java.util.ArrayList;

public class Task20IncreaseSize {
    public static void main(String[] args) {
        ArrayList<String> colors1=new ArrayList<String>();
        colors1.add("Black");
        colors1.add("Blue");
        colors1.add("Purple");
        colors1.add("Pink");
        System.out.println("original List:"+colors1);
        colors1.ensureCapacity(8);

        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Yellow");
        colors1.add("White");
        System.out.println("New Array List:"+colors1);
    }

}
