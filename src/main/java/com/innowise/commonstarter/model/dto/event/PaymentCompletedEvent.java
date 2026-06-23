package com.innowise.commonstarter.model.dto.event;

import com.innowise.commonstarter.model.enums.PaymentStatus;
import java.util.UUID;

public record PaymentCompletedEvent(
    UUID orderId,
    PaymentStatus status
) {

}