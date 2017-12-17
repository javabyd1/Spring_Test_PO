package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Opinions;
import com.sda.springstarter.demo.model.Shop;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.OpinionServiceImpl;
import com.sda.springstarter.demo.service.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private OpinionServiceImpl opinionService;

    @Autowired
    private ShopServiceImpl shopService;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Book book1 = Book.builder().title("Tytul").author("Autor1").build();
//        Book book2 = Book.builder().title("Tytul2").author("Autor2").build();

        Book book1 = new Book("Title1", "Autor1");
        Book book2 = new Book("Title2", "Autor2");

        bookService.saveBook(book1);
        bookService.saveBook(book2);

        Opinions opinion1 = new Opinions(book1, "Janek", "Fajna ksiazka");
        opinionService.saveOpinion(opinion1);

        Opinions opinion3 = new Opinions(book1, "Krzychu", "Moze byc");
        opinionService.saveOpinion(opinion3);


        Opinions opinion2 = new Opinions(book2, "Zenek", "Slaba ksiazka");
        opinionService.saveOpinion(opinion2);

        Shop shop1 = new Shop("Ksiegarnia1", "Lesna1", "Bydgoszcz");
        shopService.saveShop(shop1);





    }
}
