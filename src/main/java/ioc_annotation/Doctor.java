package ioc_annotation;


public class Doctor implements Staff {

    private String qualification;
    private Speciality doctorSpeciality;

    //Getters and Setters for class
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Speciality getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(Speciality doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }


    //Other methods
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public void examinePatient(){
        System.out.println("Doctor examines the patient");
    }
}

