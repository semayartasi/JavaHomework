package day19.homework;

import java.util.ArrayList;

public class Task19Trim {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");
        colors.add("Pink");
        System.out.println("original List:"+colors);
        colors.trimToSize();
        System.out.println(colors);

    }}
