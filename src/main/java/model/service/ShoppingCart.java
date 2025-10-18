package model.service;

import model.Food;

public class ShoppingCart {

    private final Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    // подсчет общей суммы товаров без скидки
    public double GetTotalPriceNoDiscount() {
        double result = 0;
        for (Food food : food) {
            result += food.getTotalFood();
        }
        return result;
    }

    // подсчет общей суммы товаров со скидкой
    public double GetTotalPriceWithDiscount() {
        double result = 0;
        for (Food food : food) {
            result += food.getTotalFoodDiscount();
        }
        return result;
    }

    // подсчет суммы всех вегетарианских продуктов без скидки
    public double GetTotalVeganPriceNoDiscount() {
        double result = 0;
        for (Food food : food) {
            if (food.isVegetarian()){
                result += food.getTotalFood();
            }
        }
        return result;
    }

}
