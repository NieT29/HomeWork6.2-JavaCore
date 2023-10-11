public class Patient extends Person {
    private int numberMedical;
    private String dayIn;


    public Patient() {
    }
    public Patient(String name, int age, int numberMedical, String dayIn) {
        super(name, age);
        this.numberMedical = numberMedical;
        this.dayIn = dayIn;
    }


    public int getNumberMedical() {
        return numberMedical;
    }

    public void setNumberMedical(int numberMedical) {
        this.numberMedical = numberMedical;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "numberMedical=" + numberMedical +
                ", dayIn='" + dayIn + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
