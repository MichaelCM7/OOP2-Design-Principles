package OpenClosedPrinciples.Violates;

public class InvoicePrinter {
    public void printInvoice(String type) {
        if (type.equals("PDF")) {
            System.out.println("Printing invoice as PDF...");
        } else if (type.equals("HTML")) {
            System.out.println("Printing invoice as HTML...");
        } else {
            System.out.println("Unknown invoice type!");
        }
    }
}
