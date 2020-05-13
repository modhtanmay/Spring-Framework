package com.tanmay.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
    @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    CurrencyConverter c = (CurrencyConverter)context.getBean("currencyConvert");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the currency in format 5Dollar or 5Dinar");
    String curr = scanner.next();
    System.out.println(c.getTotalCurrencyValue(curr));
    
    scanner.close();
	
}

}
