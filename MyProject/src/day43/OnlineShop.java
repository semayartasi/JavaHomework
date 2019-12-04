package day43.Homework;

public class OnlineShop {
    public static void main(String[] args) {
        Book childrenBook=new ChildrenBook("Little Prince","vvv","ddd",3,7,6,true);
        Book comicsBook=new Comics("Garfield","fff","dddd",3,5,"adult");
        childrenBook.onlineWebsite();
        System.out.println(childrenBook.getBookName()+" "+childrenBook.getPrice()


        );
        comicsBook.onlineWebsite();
        System.out.println(comicsBook.getBookName() );
    }


}
