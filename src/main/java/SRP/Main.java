package SRP;

public class Main {
    public static void main(String[] args) {
        InvoiceService service = new InvoiceService();
        double salesItem = 100;

        //alternativ 1
        double priceWithVat = service.totalWithVat(salesItem);
        service.printInvoice(salesItem, priceWithVat);

        //alternativ 2
        service.makeSale(salesItem);
    }
}
