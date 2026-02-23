import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Cafeteria Billing ===");

        
        MenuManager menuManager = new MenuManager();
        FileStore fileStore = new FileStore();
        Save save = new Save(fileStore);

       
        Total total = new Total();
        Tax tax = new Tax();
        Discount discount = new Discount();
        BillingProcess billing =
                new BillingProcess(total, tax, discount);

        InvoiceCreator invoiceCreator = new InvoiceCreator();
        FormatInvoice formatter = new FormatInvoice();
        InvoicePrinter printer = new InvoicePrinter();

      
        CafeteriaSystem sys = new CafeteriaSystem(
                menuManager,
                save,
                invoiceCreator,
                billing,
                formatter,
                printer
        );

       
        sys.addToMenu(new MenuItem("M1", "Veg Thali", 80.00));
        sys.addToMenu(new MenuItem("C1", "Coffee", 30.00));
        sys.addToMenu(new MenuItem("S1", "Sandwich", 60.00));

        List<OrderLine> order = List.of(
                new OrderLine("M1", 2),
                new OrderLine("C1", 1)
        );

        sys.checkout("student", order);
    }
}