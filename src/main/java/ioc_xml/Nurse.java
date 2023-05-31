package ioc_xml;

public class Nurse implements Staff{

    public void assist(){
        System.out.println("Nurse is assisting");
    }
    public void setupRoom() {
        System.out.println("Nurse setups the room for patient");
    }
}
