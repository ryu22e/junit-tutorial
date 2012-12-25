package junit.tutorial;

import java.util.LinkedList;
import java.util.List;

public class BookStore {

    private List<Book> books = new LinkedList<Book>();

    public void addToCart(Book book, int index) {
        if (books.size() <= 0) {
            books.add(book);
        } else {
            books.add(index, book);
        }
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }

        return totalPrice;
    }

    public Book get(int index) {
        if (index < 0 || index >= books.size()) {
            return null;
        } else {
            return books.get(index);
        }
    }

}
