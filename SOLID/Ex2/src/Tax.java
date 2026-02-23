public class Tax {
    public TaxResult caclTax(String customerType , double subtotal){
        double taxPct = TaxRules.taxPercent(customerType);
        double tax = subtotal * (taxPct / 100.0);
        return new TaxResult(taxPct, tax);
    }
}
