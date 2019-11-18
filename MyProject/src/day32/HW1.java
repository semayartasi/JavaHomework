package homework.Day32;

public class HW1 {
    // write java program with method buyItem that accepts argument which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar
    public static void main(String[] args) {
    buyItem();
    }

    public static void buyItem() {
        boolean dontHaveMilk = false;
        if (dontHaveMilk) {
            System.out.println("I'll to go to other store");
            return;
        }
        System.out.println("buy milk");
        System.out.println("buy bread");
        System.out.println("buy water");
    }
}
