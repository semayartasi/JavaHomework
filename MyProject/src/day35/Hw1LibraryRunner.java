package day35.Homework;
//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it
public class Hw1LibraryRunner {
    public static void main(String[] args) {
        Hw1Library reader1 = new Hw1Library();
        System.out.println(reader1.printOut());
        System.out.println("----------------------");

        Hw1Library reader2=new Hw1Library("The Alchemist","Paulo Coelho","Eric Matt");
        System.out.println(reader2.printOut());
        System.out.println("----------------------");

        Hw1Library reader3=new Hw1Library("Don Quixote","Eric Matt");
        System.out.println(reader3.printOut());
        System.out.println("----------------------");

        Hw1Library reader4=new Hw1Library("Little Prince","Eric Matt");
        System.out.println(reader4.printOut());
        System.out.println("----------------------");

    }
}
