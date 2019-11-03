package day19.homework;

import javax.sound.midi.Soundbank;
import java.util.HashSet;

public class HashSetTask9ConvertArraySet {
    public static void main(String[] args) {
        HashSet<String> colors=new HashSet<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        System.out.println("Originale HashSet List:"+colors);
        String[] newArray=new String[colors.size()];
        colors.toArray(newArray);
        System.out.println("Array Elements:");
        for (String s : newArray) {
            System.out.println(s);
        }


    }
}
