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
    public double totalWithVat(double subtotal) {
        return subtotal * 1.25;
    }

    public void printInvoice(double subtotal) {
        double total = totalWithVat(subtotal);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total incl. VAT: " + total);
    }
}
