package com.ak.service;

import com.ak.entity.Book;
import com.ak.exception.BookNotFound;

interface BookManagement {
        void addBook(Book book);
        void removeBook(int bookId) throws BookNotFound;
        void updateBookInfo(int bookId, String newTitle, String newAuthor) throws BookNotFound;
        Book searchBook(int bookId) throws BookNotFound;

}
