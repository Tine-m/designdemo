package OCP;

public class BlackFridayDiscount implements DiscountPolicy {

    @Override
    public double apply(double price) {
        return price * 0.5;
    }
}
