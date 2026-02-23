public class Save {
        private  FileStore store = new FileStore();

    public Save(FileStore store){
        this.store = store;
    }
    public int save(String invoiceId, String content) {
        store.save(invoiceId, content);
        return store.countLines(invoiceId);
    }
}
