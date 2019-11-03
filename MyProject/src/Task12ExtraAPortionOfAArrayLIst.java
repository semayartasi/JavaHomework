package day19.homework;

import java.util.ArrayList;
import java.util.List;

public class Task12ExtraAPortionOfAArrayLIst {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Pink");
        System.out.println("Original List:"+ colors);
        List<String> sub_List=colors.subList(0,3);
        System.out.println("List of three elements:"+sub_List);
    }
}
