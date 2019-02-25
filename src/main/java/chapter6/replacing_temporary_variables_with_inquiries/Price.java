package chapter6.replacing_temporary_variables_with_inquiries;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Price {
    private final double quantity;
    private final double itemPrice;

    public double getPrice() {
        if (basePrice() > 1000) {
            return basePrice() * .95;
        } else {
            return basePrice() * .98;
        }
    }

    private double basePrice() {
        return this.quantity * this.itemPrice;
    }
}
