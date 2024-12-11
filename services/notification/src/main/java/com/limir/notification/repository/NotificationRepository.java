package com.limir.notification.repository;

import com.limir.notification.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository <Notification, String> {

}
