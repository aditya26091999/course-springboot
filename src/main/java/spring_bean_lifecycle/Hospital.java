package spring_bean_lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Hospital implements BeanNameAware {

    void createHospital(){
        System.out.println("Hospital is created");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName method is activated");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method is activated");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destory method is activated");
    }
}
