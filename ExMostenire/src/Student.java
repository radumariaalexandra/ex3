public class Student extends User{
    public String getYear() {
        return year;
    }

    public String getGrades() {
        return grades;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    private String year;
    private String grades;

    public Student(String name, String email, char sex, String phoneNumber, String year, String grades){
        super(name, email, sex, phoneNumber);
        this.year = year;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() +'\'' +
                "email='" + getEmail()  +'\'' +
                "sex ='" + getSex() +'\'' +
                "phoneNumber='" + getPhoneNumber() + '\'' +
                "year='" + year + '\'' +
                ", grades='" + grades + '\'' +
                '}';
    }
}
