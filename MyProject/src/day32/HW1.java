package homework.Day32;

public class HW1 {
    // write java program with method buyItem that accepts argument which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar
    public static void main(String[] args) {
        buyItem("milk");
        buyItem("water");
        buyItem("sugar");
    }

    static void buyItem( String items ){
        System.out.println( "I go to store and bought a " +items);

    }
}
