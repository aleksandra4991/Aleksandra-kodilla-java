package com.kodilla.patterns.adapter.bookclasifier;

import com.kodilla.patterns.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    public int publicationYearMedian(Set<Book> bookSet){
        Map<BookSignature, com.kodilla.patterns.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book book: bookSet) {
            books.put(new BookSignature(book.getSignature()),
                    new com.kodilla.patterns.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
