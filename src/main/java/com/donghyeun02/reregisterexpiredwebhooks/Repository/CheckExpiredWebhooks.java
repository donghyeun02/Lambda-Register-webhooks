package com.donghyeun02.reregisterexpiredwebhooks.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckExpiredWebhooks {
    private final WebhookRepository webhookRepository;

    @Autowired
    public CheckExpiredWebhooks(WebhookRepository webhookRepository) {
        this.webhookRepository = webhookRepository;
    }

    public List<WebhookEntity> getExpiredWebhooks() {
        String startOfDayUnixTime = StartOfDayUnixTime.startOfDay();
        return webhookRepository.findByExpirationLessThan(startOfDayUnixTime);
    }
}
