package com.mcsumdu.hritsay.specialty.models;

public class UrlAdress {
    private int urlId;
    private String title;
    private String urlType;

    public UrlAdress() {}

    public UrlAdress(int urlId, String title, String urlType) {
        this.urlId = urlId;
        this.title = title;
        this.urlType = urlType;
    }

    public int getUrlId() {
        return urlId;
    }

    public void setUrlId(int urlId) {
        this.urlId = urlId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    @Override
    public String toString() {
        return "UrlAdress{" +
                "urlId=" + urlId +
                ", title='" + title + '\'' +
                ", urlType='" + urlType + '\'' +
                '}';
    }
}
