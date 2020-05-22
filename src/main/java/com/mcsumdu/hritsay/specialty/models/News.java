package com.mcsumdu.hritsay.specialty.models;



import java.sql.Date;

public class News {


    private int id;

    private String title;
    private String description;
    private String text;
    private int imgUrlId;
    private Date date;


    public News(int id, String title, String description, String text, int urlToImage, Date date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.text = text;
        this.imgUrlId = urlToImage;
        this.date = date;
    }

    public News() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgUrlId() {
        return imgUrlId;
    }

    public void setImgUrlId(int imgUrlId) {
        this.imgUrlId = imgUrlId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", urlToImage='" + imgUrlId + '\'' +
                ", date=" + date +
                '}';
    }
}
