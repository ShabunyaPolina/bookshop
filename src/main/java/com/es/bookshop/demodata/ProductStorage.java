package com.es.bookshop.demodata;

import com.es.bookshop.dao.item.ProductStorageItem;
import com.es.bookshop.product.Price;
import com.es.bookshop.product.book.Book;;

import java.util.ArrayList;

public class ProductStorage extends ArrayList<ProductStorageItem> {
    protected Long lastID;

    public ProductStorage() {
        lastID = 0L;

        add(new ProductStorageItem(++lastID,
                new Book("ak1",
                        new Price(13, "$"),
                        "Anna Karenina",
                        "Lev Tolstoy",
                        "Russian",
                        "Azbuka",
                        832,
                        "Anna Karenina is the best novel about a woman written in the 19th century. " +
                                "This is a novel about the tragic love of a married lady Anna Karenina and a " +
                                "brilliant officer Alexei Vronsky against the backdrop of a happy family life of " +
                                "the nobles Konstantin Levin and Kitty Shcherbatskaya.",
                        "/images/AnnaKarenina.jpg"
                )));

        add(new ProductStorageItem(++lastID,
                new Book("pap3",
                        new Price(16, "$"),
                        "Pride and Prejudice",
                        "Jane Austen",
                        "English",
                        "Large Print Classics",
                        498,
                        "Pride and Prejudice is an 1813 novel of manners by Jane Austen. " +
                                "The novel follows the character development of Elizabeth Bennet, " +
                                "the dynamic protagonist of the book who learns about the repercussions " +
                                "of hasty judgments and comes to appreciate the difference between superficial " +
                                "goodness and actual goodness.",
                        "/images/PrideAndPrejudice.jpg"
                )));

        add(new ProductStorageItem(++lastID,
                new Book("jr6",
                        new Price(9, "$"),
                        "Jane Eyre",
                        "Charlotte Bronte",
                        "English",
                        "Public Works Steampunk",
                        614,
                        "Jane Eyre is a novel by the English writer Charlotte Bronte." +
                                "The book contains elements of social criticism with a strong sense " +
                                "of Christian morality at its core, and it is considered by many to be " +
                                "ahead of its time because of Jane's individualistic character and how the " +
                                "novel approaches the topics of class, sexuality, religion, and feminism." +
                                "It, along with Jane Austen's Pride and Prejudice, is one of the most famous " +
                                "romance novels.",
                        "/images/JaneEyre.jpg"
                )));
    }

    public Long getLastID() {
        return lastID;
    }
}
