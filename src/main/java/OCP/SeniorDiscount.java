package OCP;

public class SeniorDiscount implements DiscountPolicy {
    public double apply(double price) { return price * 0.8; }
}
