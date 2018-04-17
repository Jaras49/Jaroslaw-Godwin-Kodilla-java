package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("IT books");
        library.addBook(new Book("Java Rusz głową", "xyz", LocalDate.of(1992, 2, 22)));
        library.addBook(new Book("Wzorce projektowe Rusz Głową", "xyz", LocalDate.of(2000, 11, 14)));

        Library shallowLibrary = null;
        Library deepLibrary = null;
        try {
            shallowLibrary = library.shallowCopy();
            deepLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        shallowLibrary.addBook(new Book("xx", "xx", LocalDate.of(2018, 7, 7)));

        //Then
        assertEquals(3, library.getBooks().size());
        assertSame(library.getBooks(), shallowLibrary.getBooks());
        assertEquals(3, shallowLibrary.getBooks().size());
        assertEquals(2, deepLibrary.getBooks().size());
    }
}
