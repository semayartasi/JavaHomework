package day19_HashSet;
import java.util.ArrayList;
public class Task17EmptyArray {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Purple");
        System.out.println("Original Array List:"+colors);
        colors.removeAll(colors);
        System.out.println("after remove all:"+colors);


    }
}
