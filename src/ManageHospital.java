
public class ManageHospital {
    Patient patient1 = new Patient("Thành",23,1,"22/12/2023");
    Patient patient2 = new Patient("Pháp",23,1,"22/12/2023");

    Doctor doctor1 = new Doctor("Hiếu",55,"Răng Hàm mặt",8);
    Doctor doctor2 = new Doctor("Kiên",51,"Tai Mũi Họng",6.5);

    @Override
    public String toString() {
        return "ManageHospital{" +
                "patient1=" + patient1 +
                ", patient2=" + patient2 +
                ", doctor1=" + doctor1 +
                ", doctor2=" + doctor2 +
                '}';
    }
}
