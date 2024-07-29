public interface Document {
    void open();
    void save();
    void close();
    String getTitle();
    String getAuthor();
    void setTitle(String title);
    void setAuthor(String author);
}