package OCP;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // applikationsflow/logik

        // 1 registrering af vare vi vil købe
        double salesItem = 200;

        // 2 beregne rabat
        //Student discount
        double priceAfterDiscount = calculator.priceAfterDiscount(new StudentDiscount(), salesItem);


        // 3 udskriv pris
        System.out.println("Student price " + priceAfterDiscount);

        //Senior discount
        priceAfterDiscount = calculator.priceAfterDiscount(new SeniorDiscount(), salesItem);
        System.out.println("Senior price " + priceAfterDiscount);

        // Black Friday discount
        priceAfterDiscount = calculator.priceAfterDiscount(new BlackFridayDiscount(), salesItem);
        System.out.println("Black Friday price " + priceAfterDiscount);
    }
}
