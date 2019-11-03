package day19.homework;

import java.util.HashSet;

public class HashSetTask12RemoveAll {
    public static void main(String[] args) {
        HashSet<String> colorsList1=new HashSet<String>();
        colorsList1.add("Black");
        colorsList1.add("Blue");
        colorsList1.add("Pink");
        colorsList1.add("Purple");
        System.out.println("Hashset Content" +colorsList1);
        colorsList1.clear();
        System.out.println("hashset content:"+colorsList1);

    }
}
