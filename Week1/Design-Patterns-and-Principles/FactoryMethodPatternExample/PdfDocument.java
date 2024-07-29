public class PdfDocument extends AbstractDocument {
    @Override
    public void open() {
        System.out.println("Opening PDF document: " + title);
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document: " + title);
    }
}