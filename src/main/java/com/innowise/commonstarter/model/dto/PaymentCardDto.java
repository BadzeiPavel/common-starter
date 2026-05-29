package com.innowise.commonstarter.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;

@Builder
public record PaymentCardDto(
    UUID id,
    UUID userId,
    String number,
    String holder,
    LocalDate expirationDate,
    boolean active,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {

}