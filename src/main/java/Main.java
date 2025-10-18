import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.green;
import static model.constants.Colour.red;

public class Main {
    public static void main(String[] args) {
        Food[] food = new Food[] {
                new Meat(5, 100.00),
                new Apple(10, 50.00, red),
                new Apple(8, 60.00, green)

        };

        ShoppingCart res = new ShoppingCart(food);
        System.out.println("Общая сумма товаров без скидки: " + res.GetTotalPriceNoDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + res.GetTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + res.GetTotalVeganPriceNoDiscount());

    }
}
