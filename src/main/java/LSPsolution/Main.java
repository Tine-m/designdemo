package LSPsolution;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,2);
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Area of Rectangle (5x10): " + rectangle.area());

        Square square = new Square();
        square.setSide(5);
        System.out.println("Area of Square (5x5): " + square.area());

        Shape rectangle2 = new Rectangle(2,10);
        System.out.println("Area of Rectangle (5x10): " + rectangle2.area());
    }
}
