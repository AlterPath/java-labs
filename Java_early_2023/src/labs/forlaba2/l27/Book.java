package labs.forlaba2.l27;

public class Book {
    private String author;
    private int yearOfPubl;
    private String name;
    private String genre;

    public Book(String author, int yearOfPubl, String name, String genre) {
        this.author = author;
        this.yearOfPubl = yearOfPubl;
        this.name = name;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPubl() {
        return yearOfPubl;
    }

    public void setYearOfPubl(int yearOfPubl) {
        this.yearOfPubl = yearOfPubl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", yearOfPubl=" + yearOfPubl +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
