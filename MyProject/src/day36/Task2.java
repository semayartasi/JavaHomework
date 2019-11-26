package day36.Homework;
//use string "HelloWorld
// 2. create array of size 10, create a loop from 0 to 100, and try to print every element in array
public class Task2 {
    public static void main (String[] args)
    {
        int[] myIntArray = new int[10];

        for (int i = 0; i < 100; i++) {
            try {
                System.out.print(myIntArray[i]);
            } catch (Exception ex) {
            }
        }
        System.out.println("We have non existing index number");
    }}

