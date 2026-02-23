import java.util.*;

public class CafeteriaSystem {
    // private final Map<String, MenuItem> menu = new LinkedHashMap<>();
    MenuManager menuManager;
    // private final FileStore store = new FileStore();
    private Save saveData;
    // private int invoiceSeq = 1000;
    private InvoiceCreator invoiceCreator;
    private BillingProcess billing;
    private FormatInvoice fi;
    private InvoicePrinter printer;

    public CafeteriaSystem( MenuManager menuManager, Save saveData, InvoiceCreator invoiceCreator, BillingProcess billing, FormatInvoice fi,InvoicePrinter printer) {
    this.menuManager = menuManager;
    this.saveData = saveData;
    this.invoiceCreator = invoiceCreator;
    this.billing = billing;
    this.fi = fi;
    this.printer = printer;
}

    // public void addToMenu(MenuItem i) { 
    //     menu.put(i.id, i); 
    // }
    public void addToMenu(MenuItem i){
        menuManager.add(i);
    }

    // Intentionally SRP-violating: menu mgmt + tax + discount + format + persistence.
    public void checkout(String customerType, List<OrderLine> lines) {
        String invId = invoiceCreator.createId();
        // String invId = "INV-" + (++invoiceSeq);
        // StringBuilder out = new StringBuilder();
        // out.append("Invoice# ").append(invId).append("\n");

        // double subtotal = 0.0;
        // for (OrderLine l : lines) {
        //     MenuItem item = menu.get(l.itemId);
        //     double lineTotal = item.price * l.qty;
        //     subtotal += lineTotal;
        //     out.append(String.format("- %s x%d = %.2f\n", item.name, l.qty, lineTotal));
        // }

        // double taxPct = TaxRules.taxPercent(customerType);
        // double tax = subtotal * (taxPct / 100.0);

        // double discount = DiscountRules.discountAmount(customerType, subtotal, lines.size());

        // double total = subtotal + tax - discount;

        BillResult result = billing.process(customerType, menuManager.getAll(), lines);

        // out.append(String.format("Subtotal: %.2f\n", subtotal));
        // out.append(String.format("Tax(%.0f%%): %.2f\n", taxPct, tax));
        // out.append(String.format("Discount: -%.2f\n", discount));
        // out.append(String.format("TOTAL: %.2f\n", total));
        String out = fi.format(invId , result, menuManager.getAll() , lines);
        String printable = InvoiceFormatter.identityFormat(out);
        // System.out.print(printable);
        printer.print(printable);

        // store.save(invId, printable);
        int lineCount = saveData.save(invId, printable);
        // System.out.println("Saved invoice: " + invId + " (lines=" + store.countLines(invId) + ")");
        printer.printSaveMessage(invId, lineCount);
    }
}
