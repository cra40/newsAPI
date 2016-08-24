package com.sky.news.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by cra40 on 24/08/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newsContent", propOrder = {
        "headline",
        "body"
})
public class NewsItem {
    String headline;
    String body;

    public NewsItem(String headline, String body) {
        this.headline = headline;
        this.body = body;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
