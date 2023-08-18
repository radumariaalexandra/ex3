public class Professor extends User {
    public String getClassTaught() {
        return classTaught;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    public void setClassTaught(String classTaught) {
        this.classTaught = classTaught;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    private String classTaught;
    private String schedule;
    private String grade;
    private String group;

    public Professor(String name, String email, char sex, String phoneNumber, String classTaught, String schedule,
                     String grade, String group){
        super(name, email, sex, phoneNumber);
        this.classTaught = classTaught;
        this.schedule = schedule;
        this.grade = grade;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + getName() +'\'' +
                "email='" + getEmail()  +'\'' +
                "sex ='" + getSex() +'\'' +
                "phoneNumber='" + getPhoneNumber() + '\'' +
                "classTaught='" + classTaught + '\'' +
                ", schedule='" + schedule + '\'' +
                ", grade='" + grade + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

