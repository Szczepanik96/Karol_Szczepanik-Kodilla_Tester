package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBooks(){

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto book1 = new BookDto("Title 1","Author 1");
        BookDto book2 = new BookDto("Title 2","Author 2");
        Mockito.when(bookServiceMock.getBooks()).thenReturn(Arrays.asList(book1,book2));
        bookController.addBook(book1);
        bookController.addBook(book2);

        List<BookDto> result  = bookController.getBooks();

        assertThat(result).hasSize(2);
    }
}