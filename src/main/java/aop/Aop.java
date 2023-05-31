package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aop {
    public static void main(String[] args) {
        System.out.println("Aspect Oriented Programming!");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.helloWorld();
        shoppingCart.checkout();
    }
}
