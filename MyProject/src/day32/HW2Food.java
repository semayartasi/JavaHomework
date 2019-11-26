package homework.Day32;

public class HW2Food {
    // create class Food
    // add at least 5 attributes
    // add at least 2 methods
    public String vegetable;
    public String fastFood;
    public String fruit;
    public String drink;
    public double shopWeight;
    public double unit;
    public boolean vegan;
    public boolean kosher;

    public Boolean vegetarian(){
        if (vegan==true){
            return true;
        }else {
           return false;
        }
    }

    public void shoopping() {
        if (shopWeight > 15) {
            System.out.println("It is too heavy for carrying");
        } else {
            System.out.println("You can carry");
        }
    }

    public String toString() {
        String output = "Name: " + vegetable + "\n";
        output += "Vegan: " + vegan + "\n";
        output += "Shopping Weight: " + shopWeight + "\n";
        return output;
    }



}
