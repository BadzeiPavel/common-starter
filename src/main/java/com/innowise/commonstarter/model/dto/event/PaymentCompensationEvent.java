package com.innowise.commonstarter.model.dto.event;

import java.util.UUID;

public record PaymentCompensationEvent(
    UUID orderId,
    String reason
) {

}