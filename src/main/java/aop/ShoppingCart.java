package aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("Checkout service being called");
    }

    public void helloWorld(){
        System.out.println("Hello World service");
    }

}
