package com.donghyeun02.reregisterexpiredwebhooks.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "webhooks")
public class WebhookEntity {
    @Id
    private  Long id;

    private String calendar;

    private String webhook_id;

    private String expiration;

    private String slack_user_id;

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    public String getWebhookId() {
        return webhook_id;
    }

    public void setWebhookId(String webhookId) {
        this.webhook_id = webhookId;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getSlackUserId() {
        return slack_user_id;
    }

    public void setSlackUserId(String slackUserId) {
        this.slack_user_id = slackUserId;
    }
}
