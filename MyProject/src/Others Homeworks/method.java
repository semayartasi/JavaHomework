package homework;

import javax.swing.*;

public class method {
    public static void main(String[] args) {
        int num1 = 43;
        int num2 = 44;


//        int a=9;
//        a++;
//        a+=3;
//        a-=10;
//        a*=2;
//        a/=4;



        TestComparing(num1,num2);
        Addition(num1, num2);
        Deduction(num1, num2);
        Multiply(num1, num2);
        Divide(num1, num2);
    }

            private static void TestComparing(int number1, int number2){
                if (number1 == number2)
                {
                    System.out.println("Numbers are equal");
                }
                else
                    {
                        System.out.println("Numbers are not equal");
                        }
            }






            private static void Addition(int number1, int number2) {
                System.out.println("Addition "+(number1+number2));
            }
            private static void Deduction(int number1, int number2) {
                System.out.println("Deduction "+(number1-number2));
            }
            private static void Multiply(int number1, int number2) {
            System.out.println("Multiply "+(number1*number2));
            }
            private static void Divide(int number1, int number2) {
            System.out.println("Divide "+(number1/number2));
             }
}






