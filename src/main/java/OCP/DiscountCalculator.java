package OCP;


/**
 * Open/Closed Principle
 * 1) Explain why the new version of discount method is better
 * 2) Introduce new loyalty discount policy that
 *  gives 10% discount if loyality points > 1000
 */

/*
Old version - ikke lukket for ændring
 */
public class DiscountCalculator {
    public double priceAfterDiscountOLD(String type, double price) {
        return switch (type) {
            case "student" -> price * 0.9;
            case "senior"  -> price * 0.8;
            default        -> price;
        };
    }

    /*
    New version: Åben for udvidelse, lukket for ændring
     */
    public double priceAfterDiscount(DiscountPolicy policy, double price) {
        return policy.apply(price);
    }
}
