package day35.Homework;
//create a class
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it
public class Hw2Library {
    public String book;
    public String author;
    public String reader;
    public Boolean back;
    public String backDay;

    public Hw2Library(){
        book="Animal Farm";
        author="George Orwell";
        reader="John Mark";
    }

    public Hw2Library(boolean back){
        this("Nineteen Eight Four","George Orwell","Mithell Mark",true);
    }

    public Hw2Library(String bookName, String authorName, String readerName){
        this.book=bookName;
        this.reader=readerName;
        this.author=authorName;

    }
    public Hw2Library(String bookName, String readerName){
        this.book=bookName;
        this.reader=readerName;
    }

    public Hw2Library(String bookName, String authorName, String readerName,boolean back){
        this.book=bookName;
        this.author=authorName;
        this.reader=readerName;
        this.back=true;
    }
    public Hw2Library(String bookName, String authorName, String readerName,boolean back,String returnDate){
        this.book=bookName;
        this.author=authorName;
        this.reader=readerName;
        this.back=true;
        this.backDay=returnDate;
    }

    public String printOut(){
        System.out.println("Brooklyn Library");
        String a="Book Name:"+book+"\n";
        String b="Book Author:"+author+"\n";
        String c="Reader Name:"+reader+"\n";
        String d="Return book:"+back+"\n";
        String e="Return date:"+backDay+"\n";

        return a+b+c+d+e;
    }

}
