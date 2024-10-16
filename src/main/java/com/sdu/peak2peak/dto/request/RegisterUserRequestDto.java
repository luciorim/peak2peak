package com.sdu.peak2peak.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterUserRequestDto {

    @NotNull
    private String username;

    @Size(min = 5, message = "Password should have minimum 5 characters")
    @NotNull
    private String password;

    @Size(min = 5, message = "Password should have minimum 5 characters")
    @NotNull
    @JsonProperty("confirm_password")
    private String confirmPassword;

    @NotNull
    private String email;
}
