package com.example.jpa.jpademo.Repository;

import com.example.jpa.jpademo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookRepository extends JpaRepository<Book,Integer> {

    Book findById(int id);


    @Query(value = "select * from Book b where b.author_name=:my_name",nativeQuery = true)
    public List<Book> findByAuthor(String my_name);
}
