package com.example.jpa.jpademo;

import com.example.jpa.jpademo.Repository.BookRepository;
import com.example.jpa.jpademo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Autowired
    BookRepository bookRepository;
    @Override
    public void run(String... args)  {
     Book b1 = new Book(3,"nam","shiv",24);

        System.out.println(bookRepository.findAll());
        System.out.println(bookRepository.findById(2));
        System.out.println(bookRepository.findByAuthor("shiv"));
    }
}
