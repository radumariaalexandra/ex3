import java.util.ArrayList;

public class Biography {
    private String name;
    private String birthdate;
    private String  placeOfBirth;
    private ArrayList<String> education;
    private boolean isAlive;

    // mai sus am scris atributiile pt clasa biography

    public Biography(String name, String birthdate, String placeOfBirth, ArrayList<String> education, boolean isAlive){
        this.name = name;
        this.birthdate = birthdate;
        this.placeOfBirth = placeOfBirth;
        this.education = education;
        this.isAlive = isAlive;

        //acesta este constructorul pentru clasa biography
        // pt a putea da valori
        //constructorul are numele clasei
        // get si set metoda care returneaza o mostenire, o anumita informatie, numai prin get poti vedea ceva din privat
        //get imi da ceva
        //set imi actualizeaza ce am in clasa,pot face mai multe actiuni, seteaza
        ///ambele metode sunt folosite in afara clasei
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void  setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String geteducation() {
        return education;
    }
    public void setAlive(String Alicve) {
        this.isAlive = isAlive;
    }
    public String getisAlive() {
        return isAlive;
    }

    public Biography(String name, String birthdate, boolean isAlive) {
        this.name = name;
        this.birthdate = birthdate;
        this.isAlive = isAlive;
        this.placeOfBirth = "Unkonwn";
        this.education = null;
        //un alt contructor , se diferentieza dupa parametri pe care ii dau

    }







}
