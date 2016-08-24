package com.sky.news.controller;

import com.sky.news.model.NewsItem;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cra40 on 24/08/2016.
 */
@RestController
public class NewsController {

    @CrossOrigin(origins = "http://localhost:9876")
    @RequestMapping(value = "/newsFeed", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<NewsItem> getNews() {
        List<NewsItem> newsItems = Arrays.asList(new NewsItem("Headline1", "Body1"), new NewsItem("Headline2", "Body2"));
        return newsItems;
    }
}
