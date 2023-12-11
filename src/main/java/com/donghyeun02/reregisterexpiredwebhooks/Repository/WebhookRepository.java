package com.donghyeun02.reregisterexpiredwebhooks.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebhookRepository extends JpaRepository<WebhookEntity, Long> {
    List<WebhookEntity> findByExpirationLessThan(String expiration);
}
