package day36.Homework;
// 1. use string "HelloWorld" and get char at index 100
public class Task1 {
    public static void main(String[] args) {

        String strCharat = "HelloWorld";
        try {
            System.out.println("The character index is: " + strCharat.charAt(5));
        }catch (Exception ex){
            System.out.println("We have non existing index character");
        }
    }
}


