package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int pageCount;

    public Book(String nameBook, int pageCount) {
        this.nameBook = nameBook;
        this.pageCount = pageCount;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}