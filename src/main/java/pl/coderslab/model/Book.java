package pl.coderslab.model;

import lombok.Value;

@Value
public class Book {

    long id;
    String isbn;
    String title;
    String author;
    String publisher;
    String type;
}
