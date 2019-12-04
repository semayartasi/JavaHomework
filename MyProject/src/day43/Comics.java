package day43.Homework;

public class Comics extends Book {
    private String ageGroup;
    @Override
    public void onlineWebsite(){
        System.out.println("sell by Amazon Comics");
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public Comics(String bookName, String author, String publisher, int edition, int price, String ageGroup) {
        super(bookName, author, publisher, edition, price);
        this.ageGroup = ageGroup;
    }

}
