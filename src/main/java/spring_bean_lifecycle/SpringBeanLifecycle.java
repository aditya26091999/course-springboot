package spring_bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanLifecycle {

    public static void main(String[] args) {
        System.out.println("SpringBeanLifecycle Class");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Hospital hospital = context.getBean(Hospital.class);
        hospital.createHospital();
        ((AnnotationConfigApplicationContext)context).close();
    }

}
