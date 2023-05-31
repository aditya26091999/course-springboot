package singleton_prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Doctor {

    private String doctorName;
    private String doctorQualification;

    public Doctor() {

    }

    public Doctor(String doctorName, String doctorQualification) {
        this.doctorName = doctorName;
        this.doctorQualification = doctorQualification;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorQualification() {
        return doctorQualification;
    }

    public void setDoctorQualification(String doctorQualification) {
        this.doctorQualification = doctorQualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
