package day19.homework;
import java.util.ArrayList;
import java.util.Collections;
public class task10ShuffleElements {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        System.out.println("Before Shuffling:"+colors);
        Collections.shuffle(colors);
        System.out.println("After Shuffling:"+colors);
    }
}
