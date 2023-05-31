package ioc_xml;

public class Wardboy implements Staff{

    private int wid;

    //Class related constructors
    Wardboy(){

    }

    Wardboy(int wid){
        this.wid = wid;
    }

    //Getter and setters for the class specific private variables
    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }
    public void assist(){
        System.out.println("Wardboy is assisting");
    }

    public void stretcher(){
        System.out.println("Wardboy brings stretcher");
    }
}
