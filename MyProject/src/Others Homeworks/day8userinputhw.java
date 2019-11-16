package homework;

import java.util.Scanner;

public class day8userinputhw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("write a number: ");
        String number = scan.nextLine();
        String zero="zero";
        String one="one";
        String two="two";
        String three="three";
        if(number.equals(zero))
        {
            System.out.println("0");
        }
        if(number.equals(one))
        {
            System.out.println("1");
        }
        if(number.equals(two))
        {
            System.out.println("2");
        }
        if(number.equals(three))
        {
            System.out.println("3");
        }



    }


}
