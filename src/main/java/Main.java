import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100.0);
        Food apple_red = new Apple(10, 50.0, Colour.RED);
        Food apple_green = new Apple(8, 60.0, Colour.GREEN);

        Food[] products = {meat, apple_red, apple_green};
        ShoppingCart basket = new ShoppingCart(products);

        System.out.println(basket.getTotalBasketWithoutDiscount());
        System.out.println(basket.getTotalBasketWithDiscount());
        System.out.println(basket.getTotalBasketVegetarianWithoutDiscount());
    }
}
