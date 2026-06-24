package com.innowise.commonstarter.config.kafka;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kafka.topics")
public record KafkaTopics(
    String paymentEvents,
    String paymentCompensation
) {

}