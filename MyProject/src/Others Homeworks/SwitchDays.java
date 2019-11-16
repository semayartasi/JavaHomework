package homework;
import java.util.Scanner;
public class SwitchDays {
    public static void main(String[] args) {
        // Task 2 / Homework:
// Continue task 1, but do opposite
// Monday => 1
// Tuesday => 2
// Sunday => 7
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a day(Monday to Sunday):");
        String day = scan.nextLine();
        switch (day) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
                default:
                System.out.println("invalid data");
        }

    }
}