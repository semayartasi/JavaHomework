package homework.Day32;
public class HW2 {
    public static void main(String[] args) {
        HW2Food shoppinglist=new HW2Food();
        shoppinglist.shopWeight=15;
        shoppinglist.drink="cola";
        shoppinglist.fastFood="Onion Ring";
        shoppinglist.fruit="apple";
        shoppinglist.kosher=true;
        shoppinglist.vegan=true;
        shoppinglist.vegetable="zuchcini";
        shoppinglist.shoopping();

        String output = shoppinglist.toString();
        System.out.println(output);


    }
}
