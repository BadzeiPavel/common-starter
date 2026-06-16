package com.innowise.commonstarter.model.dto.request;

import com.innowise.commonstarter.model.enums.Role;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
    @NotBlank @Size(min = 3, max = 50) String username,
    @NotBlank String password,
    @NotNull Role role,
    @Valid @NotNull UserCreationDto userDetails
) {

}