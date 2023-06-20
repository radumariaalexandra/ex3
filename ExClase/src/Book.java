import java.util.ArrayList;

public class Book {
    private String title;
    private int yearPublished;
    private int numberOfPages;
    private ArrayList<String> genre;
    private ArrayList<String> format;
    private String language;
    private int ageRecommandation;
    private ArrayList<String> editorilAgency;
    private double price;
    private boolean isInStock;
    private int quantity;





    public Book (String title, int yearPublished, int numberOfPages, ArrayList<String> genre, ArrayList<String> format,String language,
                 int ageRecommandation, ArrayList<String> editorilAgency, double price, boolean isInStock, int quantity) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.format = format;
        this.language = language;
        this.ageRecommandation = ageRecommandation;
        this.editorilAgency = editorilAgency;
        this.price = price;
        this.isInStock = isInStock;
        this.quantity = quantity;
    }
    public void translateThisBook(String language){
        this.language =language;
    }
    public void changeAgeRecommandation(int ageRecommandation) {
        this.ageRecommandation = ageRecommandation;
    }
    public void setInStock(boolean isInStock) {
        return isInStock;
    }
    public int getQuantity (){
        return quantity;
    }
    public double getPrice (double price) {
        return this.price;
    }
    public void priceCut (int percentage){
       price = price - (price * percentage / 100);
//price = price - (price*percentage/100) formula pt priceCut
    }
    public void priceIncrease (int percentage) {
       price = price + (price * percentage / 100);
    }


}
