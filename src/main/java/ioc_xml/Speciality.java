package ioc_xml;

public class Speciality {

    private String specialityCode;
    private String specialityName;


    //Constructors
    public Speciality() {
    }

    public Speciality(String specialityCode, String specialityName) {
        this.specialityCode = specialityCode;
        this.specialityName = specialityName;
    }

    //Getters and Setters
    public String getSpecialityCode() {
        return specialityCode;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "specialityCode='" + specialityCode + '\'' +
                ", specialityName='" + specialityName + '\'' +
                '}';
    }

    public void setSpecialityCode(String specialityCode) {
        this.specialityCode = specialityCode;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }
}
