public class ExcelDocument extends AbstractDocument {
    @Override
    public void open() {
        System.out.println("Opening Excel document: " + title);
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing Excel document: " + title);
    }
}