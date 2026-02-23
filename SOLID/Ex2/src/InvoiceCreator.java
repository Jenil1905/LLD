class InvoiceCreator {

    private int invoiceSeq = 1000;

    public String createId() {
        return "INV-" + (++invoiceSeq);
    }
}