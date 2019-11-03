package day19.homework;
import java.util.ArrayList;

public class Task16CloneArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Pink");

        System.out.println("original Array LIst:"+colors);
        ArrayList<String> newColors=(ArrayList<String>) colors.clone();
        System.out.println("Cloned Array List:"+newColors);
    }

}
