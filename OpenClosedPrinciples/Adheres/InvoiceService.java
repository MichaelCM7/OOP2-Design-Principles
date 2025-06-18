package OpenClosedPrinciples.Adheres;

public class InvoiceService {
    public void processInvoice(InvoicePrinter printer) {
        printer.print();
    }

    public static void main(String[] args) {
        InvoiceService service = new InvoiceService();

        InvoicePrinter pdfPrinter = new PDFInvoicePrinter();
        InvoicePrinter htmlPrinter = new HTMLInvoicePrinter();
        InvoicePrinter jsonPrinter = new JSONInvoicePrinter();

        service.processInvoice(pdfPrinter);
        service.processInvoice(htmlPrinter);
        service.processInvoice(jsonPrinter); // New behavior added without modification
    }
}

