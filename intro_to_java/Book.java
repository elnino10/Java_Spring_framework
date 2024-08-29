public class Book {
    private String title;
    private String author;
    private int pageCount;

    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // title getter function
    public String getTitle() {
        return this.title;
    }

    // author getter function
    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pageCount;
    }

    // return string representation of book
    public String toString() {
        return String.format("'%s' by '%s'", this.title, this.author);
    }
}
