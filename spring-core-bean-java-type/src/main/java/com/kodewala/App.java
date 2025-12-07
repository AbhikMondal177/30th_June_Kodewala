package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kom.kodewala.bean.Order;
import kom.kodewala.bean.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Order order=(Order)context.getBean("order");
        System.out.println(order.getOrderId()+":"+order.getItemName()+":"+order.getStatus());
    }
}
