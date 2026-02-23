public class InvoicePrinter {
    public void print(String printable) {
        System.out.print(printable);
    }
    public void printSaveMessage(String invId, int lineCount) {
        System.out.println(
            "Saved invoice: " + invId + " (lines=" + lineCount + ")"
        );
    }
}
