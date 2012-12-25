package junit.tutorial;

public class Book {

    private String title;
    private int price;
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
