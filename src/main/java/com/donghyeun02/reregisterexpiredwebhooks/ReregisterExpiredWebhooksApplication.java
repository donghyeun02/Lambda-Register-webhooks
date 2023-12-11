package com.donghyeun02.reregisterexpiredwebhooks;

import jakarta.annotation.PostConstruct;
import java.sql.Time;
import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReregisterExpiredWebhooksApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReregisterExpiredWebhooksApplication.class, args);
    }

    @PostConstruct
    private void setTimeZone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }
}
