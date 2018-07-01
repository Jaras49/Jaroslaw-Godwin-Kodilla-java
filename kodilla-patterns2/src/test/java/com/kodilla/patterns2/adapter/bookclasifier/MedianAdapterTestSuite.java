package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("test", "test", 2000, "12345677"));
        books.add(new Book("test", "test", 2005, "21421412"));
        books.add(new Book("test", "test", 2010, "234235235"));
        books.add(new Book("test", "test", 2015, "123213123"));
        books.add(new Book("test", "test", 2018, "5435435345"));

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2010, median);
    }
}