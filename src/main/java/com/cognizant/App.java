package com.cognizant;

import com.cognizant.repository.BookRepository;
import com.cognizant.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =(BookService) context.getBean("bookService");

    }
}
