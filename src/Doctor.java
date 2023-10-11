public class Doctor extends Person {
    private String specialist;
    private double hoursWorking;

    public Doctor() {
    }

    public Doctor(String name, int age, String specialist, double hoursWorking) {
        super(name, age);
        this.specialist = specialist;
        this.hoursWorking = hoursWorking;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public double getHoursWorking() {
        return hoursWorking;
    }

    public void setHoursWorking(double hoursWorking) {
        this.hoursWorking = hoursWorking;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialist='" + specialist + '\'' +
                ", hoursWorking=" + hoursWorking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
