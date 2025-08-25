package service;

import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalBasketWithoutDiscount() {
        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food product1 = products[i];
            sum = sum + (product1.getAmount() * product1.getPrice());
        }
        return sum;
    }

    public double getTotalBasketWithDiscount() {
        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food product2 = products[i];
            sum = sum + product2.getAmount() * product2.getPrice() * ((100.0 - product2.getDiscount()) / 100.0);
        }
        return sum;
    }

    public double getTotalBasketVegetarianWithoutDiscount() {
        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food products3 = products[i];
            if (products3.isVegetarian()) {
                sum = sum + products3.getAmount() * products3.getPrice();
            }
        }
        return sum;
    }
}
