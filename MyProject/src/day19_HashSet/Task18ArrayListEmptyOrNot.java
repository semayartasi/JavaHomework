package day19_HashSet;

import java.util.ArrayList;
public class Task18ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");
        colors.add("Pink");
        System.out.println("original List:"+colors);
        System.out.println("checking the above ArrayList empty or not:"+colors.isEmpty());
        colors.removeAll(colors);
        System.out.println("original List:"+colors);
        System.out.println("checking the above ArrayList empty or not:"+colors.isEmpty());



    }
}
