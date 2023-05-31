package ioc_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCXML {
    public static void main(String args[]){

        System.out.println("IoCXML Class\n");
        System.out.println("Creating hospital object with tight coupling");
        //Object Creation and management has to be done by the IoCXML class
        //Tight coupling
        Hospital hospital = new Hospital();
        hospital.createHospital();

        //Inversion of Control established by hooking into Spring Container via context
        //Context is XML based configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_xmlbasedconfig.xml");

        System.out.println("\nCreating doctor object with loose coupling [Inversion of Control - XML based]");
        System.out.println("Referencing by Bean class type in XML config");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println("Doctor has qualification : " + doctor.getQualification());
        System.out.println("Doctor has speciality in : " + doctor.getDoctorSpeciality());

        System.out.println("\nCreating nurse object with loose coupling [Inversion of Control - XML based]");
        System.out.println("Referencing by Bean id in XML config");
        Nurse nurse = (Nurse) context.getBean("ioc_xml.Nurse");
        nurse.assist();

        System.out.println("\nCreating wardboy object with loose coupling [Inversion of Control - XML based]");
        System.out.println("Referencing by Bean id in XML config and using Staff interface");
        Staff wardboy1 = (Wardboy) context.getBean("ioc_xml.Wardboy");
        wardboy1.assist();
        //Since wardboy1 is created using Staff interface, we cannot invoke wardboy1.stretcher() method

        Wardboy wardboy2 = context.getBean(Wardboy.class);
        wardboy2.assist();
        wardboy2.stretcher();


        nurse.setupRoom();
        doctor.examinePatient();



    }
}
