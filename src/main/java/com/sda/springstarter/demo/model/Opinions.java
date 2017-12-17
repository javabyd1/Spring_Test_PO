package com.sda.springstarter.demo.model;

import javax.persistence.*;

@Entity
public class Opinions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private Book id_book;
    private String nick;
    private String comment;

    public Opinions(Book id_book, String nick, String comment) {
        this.id_book = id_book;
        this.nick = nick;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getId_book() {
        return id_book;
    }

    public void setId_book(Book id_book) {
        this.id_book = id_book;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
