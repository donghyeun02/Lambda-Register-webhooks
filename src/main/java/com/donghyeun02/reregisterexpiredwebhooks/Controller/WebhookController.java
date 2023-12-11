package com.donghyeun02.reregisterexpiredwebhooks.Controller;

import com.donghyeun02.reregisterexpiredwebhooks.Repository.CheckExpiredWebhooks;
import com.donghyeun02.reregisterexpiredwebhooks.Repository.WebhookEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhooks")
public class WebhookController {
    private final CheckExpiredWebhooks checkExpiredWebhooks;

    @Autowired
    public WebhookController(CheckExpiredWebhooks checkExpiredWebhooks) {
        this.checkExpiredWebhooks = checkExpiredWebhooks;
    }

    @GetMapping("/expired")
    public ResponseEntity<List<WebhookEntity>> getExpiredWebhooks() {
        List<WebhookEntity> expiredWebhooks = checkExpiredWebhooks.getExpiredWebhooks();
        return new ResponseEntity<>(expiredWebhooks, HttpStatus.OK);
    }
}
