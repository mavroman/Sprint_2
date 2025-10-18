package model;

import model.constants.Colour;
import static model.constants.Discount.red_apple_discount;

public class Apple extends Food {

    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.red.equals(colour)) {
            return red_apple_discount;
        }
        return 0;
    }




}
