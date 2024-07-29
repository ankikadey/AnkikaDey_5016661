// DocumentManager.java
public class DocumentManager {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory("Project Plan", "John Doe");
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        DocumentFactory pdfFactory = new PdfDocumentFactory("Annual Report", "Jane Smith");
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        DocumentFactory excelFactory = new ExcelDocumentFactory("Sales Data", "Alice Johnson");
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
