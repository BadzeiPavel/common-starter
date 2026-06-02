package com.innowise.commonstarter.config.jwt;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt")
public record JwtSecrets(
    String secret,
    long accessTokenExpiration,
    long refreshTokenExpiration
) {

  @PostConstruct
  void validate() {
    if (secret == null || secret.isBlank()) {
      throw new IllegalStateException("JWT_SECRET must be configured");
    }
  }
}