package com.sparta.kurtis.hobby;

import java.util.Calendar;

public class Reading extends Hobby {
    private String bookName;
    private String genre;
    private String author;
    private String modeOfReading;
    private int currentPage;
    private int numberOfPages;

    public Reading(String description, double hoursPerWeek, double costPerMonth, boolean isDoneAlone, float priority, String startDate, String bookName, String bookGenre, String author, String modeOfReading, int currentPage, int numberOfPages) {
        super("reading", description, hoursPerWeek, costPerMonth, isDoneAlone, priority, startDate);
        this.bookName = bookName;
        this.genre = bookGenre;
        this.author = author;
        this.modeOfReading = modeOfReading;
        this.currentPage = currentPage;
        this.numberOfPages = numberOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getModeOfReading() {
        return modeOfReading;
    }

    public void setModeOfReading(String modeOfReading) {
        this.modeOfReading = modeOfReading;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\nbook name: ").append(bookName)
                .append("\ngenre: ").append(genre)
                .append("\nauthor: ").append(author)
                .append("\nmode of reading: ").append(modeOfReading)
                .append("\ncurrent page: ").append(currentPage)
                .append("\nnumber of pages: ").append(numberOfPages)
                .toString();
    }
}
