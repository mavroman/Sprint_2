import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {
        Food[] food = new Food[] {
                new Meat(5, 100.00),
                new Apple(10, 50.00, RED),
                new Apple(8, 60.00, GREEN)

        };

        ShoppingCart res = new ShoppingCart(food);
        System.out.println("Общая сумма товаров без скидки: " + res.getTotalPriceNoDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + res.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + res.getTotalVeganPriceNoDiscount());

        // System.out.printf("Общая сумма товаров без скидки: %s\n", res.getTotalPriceNoDiscount());

    }
}
