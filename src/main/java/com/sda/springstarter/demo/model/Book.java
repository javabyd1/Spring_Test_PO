package com.sda.springstarter.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    private String title;
    private String author;

    @OneToMany(mappedBy="id_book", cascade = CascadeType.ALL)
    private List<Opinions> orderList = new ArrayList<Opinions>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public List<Opinions> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Opinions> orderList) {
        this.orderList = orderList;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
