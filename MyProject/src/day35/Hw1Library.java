package day35.Homework;
//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and
public class Hw1Library {
    public String book;
    public String author;
    public String reader;

    public Hw1Library(){
        book="Animal Farm";
        author="George Orwell";
        reader="John Mark";
    }

    public Hw1Library(String bookName, String authorName, String readerName){
        this.book=bookName;
        this.reader=readerName;
        this.author=authorName;

    }
    public Hw1Library(String bookName, String readerName){
        this.book=bookName;
        this.reader=readerName;
    }

    public String printOut(){
        System.out.println("Brooklyn Library");
        String a="Book Name:"+book+"\n";
        String b="Book Author:"+author+"\n";
        String c="Reader Name:"+reader+"\n";
        return a+b+c;
    }

}
