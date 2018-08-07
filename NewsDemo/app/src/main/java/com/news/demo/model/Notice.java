package com.news.demo.model;

import com.google.gson.annotations.SerializedName;

public class Notice {

    @SerializedName("title")
    private String title;
    @SerializedName("byline")
    private String byline;
    @SerializedName("published_date")
    private String published_date;
//    @SerializedName("title")
//    private String title;

    public Notice(String title, String byline, String published_date, String fileSource) {
        this.title = title;
        this.byline = byline;
        this.published_date = published_date;
//        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }
}