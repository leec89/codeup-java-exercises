package oop;

public class oop_post_dane {

    private String title;
    private String author;
    private String creationDate;
    private String body;

    static long totalPosts;

    public oop_post_dane() {
        totalPosts++;
    }

    public oop_post_dane(String title, String author, String creationDate, String body) {
        this();
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
        this.body = body;
    }

    public String toString() {
        return "title:\n "+ this.title +
                " \n Author: "+ this.author +
                " \n CreationDate: "+ this.creationDate +
                " \n body:  "+ this.body + " \n";
    }

    public static long getTotalPosts() {
        return totalPosts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}