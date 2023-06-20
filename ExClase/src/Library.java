import java.util.ArrayList;

public class Library {
    private ArrayList<Author> authors;
    private ArrayList<Book> books;

    public Library(ArrayList<Author> authors, ArrayList<Book> books) {
        this.authors = authors;
        this.books = books;
    }
    public String filterWithGenre(String genre) {
        return genre;
    }
    public double getBookUnder(double price) {
        return price;
    }
    public int getBooksBetweenYears( int start, int end ) {
        return start;
        //cum returnez int end?
    }
    public String getBooksByAthor(String authorName) {
        return authorName;
    }
    public String getBookByName(String bookName) {
        return bookName;
    }
    public String getBookByLanguage(String language) {
        return language;
    }
    public String getAuthorByLiterayCurrent(String curent) {
        return curent;
    }














}
