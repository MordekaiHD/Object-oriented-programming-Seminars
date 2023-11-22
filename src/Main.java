import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Coffee", 50, 150, 80));
        productList.add(new HotDrink("Tea", 30, 100, 90));
        productList.add(new HotDrink("Cocoa", 70, 150, 90));
        productList.add(new HotDrink("Mulled wine", 100, 50, 60));
        productList.add(new HotDrink("Hot chocolate", 60, 150, 90));
        HotDrinksAutomatic machine = new HotDrinksAutomatic();
        machine.initProduct(productList);
        System.out.println(machine.getProduct("Cocoa", 150, 90));

    }
}
