package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Order;
import com.kodewala.bean.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    	Order order=context.getBean(Order.class);
    	System.out.println(order.getOrderId()+":"+order.getItemName()+":"+order.getOrderStatus());
    }
}
