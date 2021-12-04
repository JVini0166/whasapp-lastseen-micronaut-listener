package com.example.controller;

import com.example.api.WhatsAppLogApi;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class WhatsAppLogController implements WhatsAppLogApi {

    List<String> whatsAppLogList = new ArrayList<>();
    @Override
    public String logApi(String whatsAppLog) {
        whatsAppLogList.add(whatsAppLog);
        return whatsAppLog;
    }

    @Get()
    public List<String> homePage(){
        return whatsAppLogList;
    }
}
