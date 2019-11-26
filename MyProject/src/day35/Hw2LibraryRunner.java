package day35.Homework;
//create a class
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it
public class Hw2LibraryRunner {
    public static void main(String[] args) {
        Hw2Library reader1 = new Hw2Library();
        System.out.println(reader1.printOut());
        System.out.println("----------------------");

        Hw2Library reader2=new Hw2Library("The Alchemist","Paulo Coelho","Eric Matt");
        System.out.println(reader2.printOut());
        System.out.println("----------------------");

        Hw2Library reader3=new Hw2Library("Don Quixote","Eric Matt");
        System.out.println(reader3.printOut());
        System.out.println("----------------------");

        Hw2Library reader4=new Hw2Library("Little Prince","Eric Matt");
        System.out.println(reader4.printOut());
        System.out.println("----------------------");

        Hw2Library reader5=new Hw2Library("The Orient Express","Agatha Christhina","Alice Herald",true);
        System.out.println(reader5.printOut());
        System.out.println("----------------------");

        Hw2Library reader6=new Hw2Library( "Nineteen Eight Four","George Orwell","Mithell Mark",true);
        System.out.println(reader6.printOut());
        System.out.println("----------------------");

        Hw2Library reader7=new Hw2Library( "Nineteen Eight Four","George Orwell","Mithell Mark",true,"september,10");
        System.out.println(reader7.printOut());
        System.out.println("----------------------");

        Hw2Library reader8=new Hw2Library( "Nineteen Eight Four","George Orwell","Mithell Mark",true,"september,10");
        System.out.println(reader8.printOut());
        System.out.println("----------------------");

        Hw2Library reader9=new Hw2Library( "Nineteen Eight Four","George Orwell","Mithell Mark",true,"september,10");
        System.out.println(reader9.printOut());
        System.out.println("----------------------");

        Hw2Library reader10=new Hw2Library( "Nineteen Eight Four","George Orwell","Mithell Mark",true,"september,10");
        System.out.println(reader10.printOut());
        System.out.println("----------------------");


    }}
