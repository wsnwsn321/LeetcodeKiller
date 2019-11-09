package com.company.CompanyList.Amazon;

import java.util.*;

public class OOD_BookShelfWithLowestPrice {
    public class book{
        String name;
        double price;

        public book(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
    Stack<book> shelf;
    book min_price_book;
    public OOD_BookShelfWithLowestPrice() {
        shelf = new Stack<>();
        min_price_book = new book("null",Double.MAX_VALUE);
    }

    public void addBook(book b){
        if (b.price<=min_price_book.price){
            shelf.push(min_price_book);
            min_price_book = b;
        }
        shelf.push(b);

    }
    public void removeBook(){
        book t = shelf.pop();
        if (t.price == min_price_book.price){
            min_price_book = shelf.pop();
        }

    }
    public book getLowestPrice(){
        return min_price_book;
    }
}
