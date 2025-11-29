package model;

import model.constants.Colour;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {

    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return RED_APPLE_DISCOUNT;
        }
        return 0;
    }




}
