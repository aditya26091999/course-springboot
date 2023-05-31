package singleton_prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonPrototype {

    public static void main(String[] args) {
        System.out.println("Singleton vs Prototype beans");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Hospital hospital1 = context.getBean(Hospital.class);
        hospital1.setHospitalName("Star Hospital");
        System.out.println("Hospital1 has name : " + hospital1.getHospitalName());

        Hospital hospital2 = context.getBean(Hospital.class);
        System.out.println("Hospital2 has name : " + hospital2.getHospitalName());


        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.setDoctorName("John Doe");
        doctor1.setDoctorQualification("MBBS");
        System.out.println("Doctor1 has name : " + doctor1.getDoctorName());
        System.out.println("Doctor1 has qualification : " + doctor1.getDoctorQualification());

        Doctor doctor2 = context.getBean(Doctor.class);
        System.out.println("Doctor2 has name : " + doctor2.getDoctorName());
        System.out.println("Doctor2 has qualification : " + doctor2.getDoctorQualification());

    }
}
