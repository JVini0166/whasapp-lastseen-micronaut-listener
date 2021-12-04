package com.example.api;

import io.micronaut.http.annotation.Post;

public interface WhatsAppLogApi {
    @Post("/whatsAppLog")
    String logApi (String log);
}
