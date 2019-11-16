package homework;
import java.util.Scanner;
public class day10hwifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in your quiz score");
        int test1 = scan.nextInt();

        System.out.println("Please type in your mid-term score");
        int test2 = scan.nextInt();


        System.out.println("Please type in your final score");
        int test3 = scan.nextInt();

        System.out.println();

        int average = ((test1 + test2 + test3) / 3);
        System.out.println("Your average score is: " + average);
        System.out.println();

        if (average >= 90) {
            System.out.println("Your grade is A.");
        } else if (average >= 70) {
            System.out.println("Your grade is B.");
        } else if (average >= 50) {
            System.out.println("Your grade is C");
        } else
            System.out.println("Your grade is F");
    }
}
