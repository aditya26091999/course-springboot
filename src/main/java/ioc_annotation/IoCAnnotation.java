package ioc_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAnnotation {

    public static void main(String args[]){
        System.out.println("IoCAnnotation Class\n");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotationbasedconfig.xml");
        Hospital hospital = (Hospital) context.getBean("ioc_annotation.Hospital");
        hospital.createHospital();

        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();
        nurse.setupRoom();
    }

}
