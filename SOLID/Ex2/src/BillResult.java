public class BillResult {
     double subtotal;
     double tax;
     double total;
     double taxPct;
     double discount;
    public BillResult(double subtotal , double tax , double total, double taxPct, double discount){
        this.subtotal = subtotal;
        this.tax = tax;
        this.total = total;
        this.taxPct = taxPct;
        this.discount = discount;
    }
}
