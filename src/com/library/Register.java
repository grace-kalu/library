package com.library;

import java.time.LocalDate;


    public class Register {
        private String name;
        private String bookTitle;

        public Register(String name, String bookTitle) {
            this.name = name;
            this.bookTitle = bookTitle;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        @Override
        public String toString() {
            return this.name +
                    " has borrowed '" + this.bookTitle + '\'';
        }
    }


