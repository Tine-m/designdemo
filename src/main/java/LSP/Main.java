package LSP;

/**
 * Fix the design so Square doesn’t break Rectangle behavior.
 * Hint: maybe Square and Rectangle shouldn’t share inheritance
 * Hint: Maybe the Shape interface could be used instead?
 */
public class Main {

    public static void main(String[] args) {

        Rectangle rc = new Rectangle();
        rc.setWidth(5);
        rc.setHeight(10);
        System.out.println("Area of Rectangle (5x10): " + rc.getArea());

        Rectangle sq = new Square();
        sq.setWidth(5);
        sq.setHeight(10); // This should not be allowed for a square
        System.out.println("Area of Square (5x10): " + sq.getArea()); // Expected 25, but gets 100
    }
}
