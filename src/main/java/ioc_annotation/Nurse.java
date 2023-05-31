package ioc_annotation;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

    public void assist(){
        System.out.println("Nurse is assisting");
    }
    public void setupRoom() {
        System.out.println("Nurse setups the room for patient");
    }
}
