package SRP;

/**
 * Single Responsibility Principle
 * Refactor so that:
 * Service methods handle each their responsibility
 * (calculation and printing)
 * Refactor again: Create an extra UI class
 * that does the actual printing
 */

public class InvoiceService {

    UI ui = new UI();

    public double totalWithVat(double subtotal) {
        return subtotal * 1.25;
    }

    public void printInvoice(double subtotal, double total) {
       ui.printInvoide(subtotal, total);
    }

    //Alternativ 2
    public void makeSale(double subtotal) {
        double priceWithTax = totalWithVat(subtotal);
        ui.printInvoide(subtotal, priceWithTax);
    }
}
