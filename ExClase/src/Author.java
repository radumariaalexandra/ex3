import java.util.ArrayList;

public class Author {
    private Biography biography;
    private String literaryCurrent;
    private ArrayList<Book> writtenBooks;
    // nu stiu daca e ok
    private  String language;

    //TODO: Add parameters for biography and written books.
    public Author (Biography biography, String literaryCurrent, String language) {
        this.biography = biography;
        this.literaryCurrent = literaryCurrent;
        this.language = language;

    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLiteraryCurrent() {
        return this.literaryCurrent;
    }









}
