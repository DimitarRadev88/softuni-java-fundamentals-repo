package com.objectsAndClasses.exercise.articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        setTitle(title);
        setContent(content);
        setAuthor(author);
    }

    public void edit(String newContent) {
        setContent(newContent);
    }

    public void changeAuthor(String newAuthor) {
        setAuthor(newAuthor);
    }

    public void rename(String newTitle) {
        setTitle(newTitle);
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
