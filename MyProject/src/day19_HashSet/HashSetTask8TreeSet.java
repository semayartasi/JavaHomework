package day19_HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTask8TreeSet {
    public static void main(String[] args) {
        HashSet<String> colors=new HashSet<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        System.out.println("Originale HashSet List:"+colors);

        Set<String> newTreeSet=new TreeSet<String>(colors);

        System.out.println("TreeSet Elements:");
        for (String set : newTreeSet) {
            System.out.println(set);
        }
    }
}
