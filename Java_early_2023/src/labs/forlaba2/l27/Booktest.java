package labs.forlaba2.l27;

public class Booktest {
    public static void main(String[] args) {

        Bookshelf bookshelf  = new Bookshelf();
        Book book1 = new Book("auf", 1892, "Washington", "thriller");
        Book book2 = new Book("HOW TO SELL A PEN TO A CAT!!!!!!!!!!!", 2025, "IT WILL SHOCK YOU!!!!!!!!!?!!", "wth");
        Book book3 = new Book("ordinary book", 1977, "ordinary author", "ordinary");
        bookshelf.addExistingBook(book1);
        bookshelf.addExistingBook(book2);
        bookshelf.addExistingBook(book3);
        bookshelf.addBook();
        bookshelf.newAndLate();

    }
}
