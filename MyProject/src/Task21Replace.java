package day19.homework;

import java.util.ArrayList;

public class Task21Replace {
    public static void main(String[] args) {
        ArrayList<String> colors1=new ArrayList<String>();
        colors1.add("Black");
        colors1.add("Blue");
        System.out.println("original List:"+colors1);
        String newColor="White";
        colors1.set(1,newColor);

        System.out.println("New list");
        for (int i = 0; i < colors1.size(); i++) {
            System.out.println(colors1.get(i));

        }
    }
}
