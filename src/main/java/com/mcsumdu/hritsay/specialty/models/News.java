package com.mcsumdu.hritsay.specialty.models;



import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "site_news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    private Long id;

    private String title;

    @Column(name = "short_desc")
    private String description;

    @Column(name = "news_text")
    private String text;

    @Column(name = "url_img_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "url_img_id")
    private UrlAddress imgUrlId;

    @Column(name = "news_date")
    private Date date;


    public News(String title, String description, String text, int urlToImage, Date date) {
        this.title = title;
        this.description = description;
        this.text = text;
        this.imgUrlId = urlToImage;
        this.date = date;
    }

    public News() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
