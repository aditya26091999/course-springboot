package ioc_javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCJavaConfiguration {

    public static void main(String[] args) {
        System.out.println("IoCJavaConfiguration Class");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();
    }
}
