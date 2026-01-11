package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//creating container of object
        Alien obj= (Alien) context.getBean("alien");//getting obj from container
        obj.age=21;
        System.out.println("age :"+obj.age);
        Alien obj2= (Alien) context.getBean("alien");
        System.out.println("age :"+obj2.age);//if scope singleton then object creation singletime for all getBean, if prototype then each objectcreation everytime getBean
        obj.coding();
        Laptop obj1= (Laptop) context.getBean("lap");
    }
}
