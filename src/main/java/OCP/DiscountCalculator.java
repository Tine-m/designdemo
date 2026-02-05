package OCP;


/**
 * Open/Closed Principle
 * 1) Explain why the new version of discount method is better
 * 2) Introduce new loyalty discount policy that
 *  gives 15% discount if loyality points > 1000
 *  3) make unit tests for all three discount policies
*/
public class DiscountCalculator {

   // Old version -åben for udvidelse, men ikke lukket for ændringer
    public double priceAfterDiscountOLD(String type, double price) {
        return switch (type) {
            case "student" -> price * 0.9;
            case "senior"  -> price * 0.8;
           // case "blackFriday" -> price * 0.5;
            default        -> price;
        };
    }

    // New version: Åben for udvidelse, lukket for ændring
    public double priceAfterDiscount(DiscountPolicy policy, double price) {
        return policy.apply(price);
    }
}
