package day19_HashSet;

import java.util.HashSet;

public class HashSetTask11Retain {
    public static void main(String[] args) {
        HashSet<String> colorsList1=new HashSet<String>();
        colorsList1.add("Black");
        colorsList1.add("Blue");
        colorsList1.add("Pink");
        colorsList1.add("Purple");
        System.out.println("Hashset Content" +colorsList1);

        HashSet<String> colorsList2=new HashSet<String>();
        colorsList2.add("Black");
        colorsList2.add("Blue");
        colorsList2.add("Pink");
        colorsList2.add("Red");
        System.out.println("Hashset Content" +colorsList2);
        colorsList1.retainAll(colorsList2);
        System.out.println("hashset content:");
        System.out.println(colorsList1);
    }
}
