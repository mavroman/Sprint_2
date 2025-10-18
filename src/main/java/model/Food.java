package model;

public abstract class Food implements Discountable {

    private final int amount; // количество продукта в килограммах (целое число)
    private final double price; // цена за единицу (вещественное число)
    private final boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    // Метод для расчета общей стоимости продуктов
    public double getTotalFood() {
        return amount * price;
    }

    // Метод для расчета общей стоимости продуктов со скидкой
    public double getTotalFoodDiscount() {
        if (getDiscount() > 0) {
            return (amount * price) * (1 - getDiscount() / 100);
        } else {
            return (amount * price);
        }
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

}
