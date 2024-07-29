public class WordDocument extends AbstractDocument {
    @Override
    public void open() {
        System.out.println("Opening Word document: " + title);
    }

    @Override
    public void save() {
        System.out.println("Saving Word document: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing Word document: " + title);
    }
}