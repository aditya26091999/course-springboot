package ioc_javaconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Doctor {

    public void assist() {
        System.out.println("Doctor is assisting");
    }

}
