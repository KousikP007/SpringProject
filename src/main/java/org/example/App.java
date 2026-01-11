package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//creating container of object
        Alien obj= (Alien) context.getBean("alien");//getting obj from container
        obj.coding();
    }
}
