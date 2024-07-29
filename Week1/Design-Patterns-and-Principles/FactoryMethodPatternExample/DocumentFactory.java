public abstract class DocumentFactory {
    protected String title;
    protected String author;

    public DocumentFactory(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract Document createDocument();
}

// WordDocumentFactory.java
class WordDocumentFactory extends DocumentFactory {
    public WordDocumentFactory(String title, String author) {
        super(title, author);
    }

    @Override
    public Document createDocument() {
        Document doc = new WordDocument();
        doc.setTitle(title);
        doc.setAuthor(author);
        return doc;
    }
}

// PdfDocumentFactory.java
class PdfDocumentFactory extends DocumentFactory {
    public PdfDocumentFactory(String title, String author) {
        super(title, author);
    }

    @Override
    public Document createDocument() {
        Document doc = new PdfDocument();
        doc.setTitle(title);
        doc.setAuthor(author);
        return doc;
    }
}

// ExcelDocumentFactory.java
class ExcelDocumentFactory extends DocumentFactory {
    public ExcelDocumentFactory(String title, String author) {
        super(title, author);
    }

    @Override
    public Document createDocument() {
        Document doc = new ExcelDocument();
        doc.setTitle(title);
        doc.setAuthor(author);
        return doc;
    }
}