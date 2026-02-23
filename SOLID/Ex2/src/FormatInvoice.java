public class FormatInvoice {
    public String format(BillResult r){
        StringBuilder out = new StringBuilder();
        out.append(String.format("Subtotal: %.2f\n", r.subtotal));
        out.append(String.format("Tax(%.0f%%): %.2f\n",  r.taxPct,  r.tax));
        out.append(String.format("Discount: -%.2f\n", r.discount));
        out.append(String.format("TOTAL: %.2f\n", r.total));
        return out.toString();
    }
}
