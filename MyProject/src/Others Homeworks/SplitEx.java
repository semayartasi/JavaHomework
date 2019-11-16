package homework;
import java.util.Arrays;
public class SplitEx {

    public static void main(String[] args) {
        int counter = 0;
        String sentence = "Java is a general-purpose computer-programming "
                + "language that is concurrent, class-based, object-oriented, "
                + "and specifically designed to have as "
                +"few implementation dependencies as possible.";

        System.out.println(sentence);

        String[] words = sentence.split("-");
        System.out.println("*********************************************************");
        System.out.println(Arrays.toString(words));
        System.out.println("length = " + words.length);
        System.out.println("*********************************************************");
        for(String str: words) {
            if (str.equals("language")) {
                break;
            }
            counter++;
        }
        System.out.println("Position: "+counter);
        System.out.println(counter);
        System.out.println(words[counter-1]);
    }
   }