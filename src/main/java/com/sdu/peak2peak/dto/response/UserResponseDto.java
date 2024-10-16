package com.sdu.peak2peak.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("name")
    private String username;

    @JsonProperty("email")
    private String email;

}
