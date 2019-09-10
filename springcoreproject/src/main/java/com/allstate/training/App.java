package com.allstate.training;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.allstate.training.conf.AppConfig;
import com.allstate.training.pojos.Account;
import com.allstate.training.pojos.Address;
import com.allstate.training.pojos.Person;
import com.allstate.training.pojos.SavingsAccount;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=
        		new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner sc=new Scanner(System.in);
        Address ad1=(Address)context.getBean("address");
       System.out.println("enter address details");
        ad1.setStreet(sc.next());
        ad1.setCity(sc.next());
        ad1.setState(sc.next());
        ad1.setPincode(sc.nextInt());
        System.out.println("enter person details");
        Person p1=(Person)context.getBean("person");
        p1.setAdarNum(sc.nextLong());
        p1.setEmail(sc.next());
        p1.setPh_num(sc.nextLong());
        
        SavingsAccount a1=(SavingsAccount)context.getBean("savingsAccount");
        a1.setAccNum(sc.next());
        System.out.println(a1.deposit(1200));
        System.out.println(a1.withdraw(200));
        
    }
}
