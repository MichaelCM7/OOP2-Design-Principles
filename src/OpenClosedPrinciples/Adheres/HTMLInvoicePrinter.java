package OpenClosedPrinciples.Adheres;

public class HTMLInvoicePrinter implements InvoicePrinter {
    @Override
    public void print() {
        System.out.println("Printing invoice as HTML...");
    }
}

