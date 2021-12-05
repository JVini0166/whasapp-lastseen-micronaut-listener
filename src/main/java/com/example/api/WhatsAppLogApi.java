package com.example.api;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;

public interface WhatsAppLogApi {
    @Post
    String logApi (String log);

    @Get
    List<String> homePage();

    @Get("/clean")
    void cleanList();
}
