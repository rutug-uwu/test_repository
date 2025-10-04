package hw_practice;

public class Book {
    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isEqual(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book b = (Book) o;
        return title.equals(b.title) && author.equals(b.author);
    }
}
