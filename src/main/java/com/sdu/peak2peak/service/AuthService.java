package com.sdu.peak2peak.service;


import com.sdu.peak2peak.dto.request.AuthRequestDto;
import com.sdu.peak2peak.dto.request.RegisterUserRequestDto;
import com.sdu.peak2peak.dto.response.AuthResponseDto;


public interface AuthService {

    void registerUser(RegisterUserRequestDto user);

    AuthResponseDto authenticateUser(AuthRequestDto auth);

}
