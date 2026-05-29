package com.innowise.commonstarter.dto.response;

import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record ErrorResponse(
    String title,
    String name,
    int status,
    String message,
    String path,
    LocalDateTime timestamp
) {

}