package com.kodilla.patterns.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {

    int publicationYearMedian(Set<Book> bookSet);
}
