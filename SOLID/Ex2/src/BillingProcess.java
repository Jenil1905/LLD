import java.util.List;
import java.util.Map;

public class BillingProcess {
    private Total t;
    private Tax ta;
    private Discount dis;

    public BillingProcess(Total t, Tax ta, Discount dis) {
        this.t = t;
        this.ta = ta;
        this.dis = dis;
    }

    public BillResult process(String customerType , Map<String, MenuItem> menu,List<OrderLine> lines){
        double subtotal = t.calcTotal(menu, lines);
        double discount = dis.caclDiscount(customerType, subtotal, lines.size());
        TaxResult taxResult = ta.caclTax(customerType, subtotal);
        double tax = taxResult.tax;
        double taxPct = taxResult.taxPct;
        double total = subtotal + tax - discount;

        return new BillResult(subtotal, tax, total, taxPct, discount);

    }
}
