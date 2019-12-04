package day43.Homework;

public class ChildrenBook extends Book {
    private int age;
    private boolean child;
@Override
    public void onlineWebsite(){
        System.out.println("sell by Amazon Children Book");
    }

    public int getAge() {
        return age;
    }

    public boolean isChild() {
        return child;
    }

    public ChildrenBook(String bookName, String author, String publisher, int edition, int price, int age, boolean child) {
        super(bookName, author, publisher, edition, price);
        this.age = age;
        this.child = child;
    }
}
