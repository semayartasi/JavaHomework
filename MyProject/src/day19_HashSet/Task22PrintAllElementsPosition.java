package day19_HashSet;
import java.util.ArrayList;
public class Task22PrintAllElementsPosition {
    public static void main(String[] args) {
        ArrayList<String> colors1=new ArrayList<String>();
        colors1.add("Black");
        colors1.add("Blue");
        colors1.add("Purple");
        colors1.add("Pink");
        System.out.println("original List:"+colors1);
        System.out.println("\nPrint using index of an element:");
        int no_of_elements= colors1.size();
        for (int i = 0; i < no_of_elements; i++) {
            System.out.println(colors1.get(i));

        }
    }
}
