package OCP;

public class StudentDiscount implements DiscountPolicy {
    public double apply(double price) { return price * 0.9; }
}
