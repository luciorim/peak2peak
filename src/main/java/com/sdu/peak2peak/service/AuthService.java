package com.sdu.peak2peak.service;


import com.sdu.peak2peak.dto.request.AuthRequestDto;
import com.sdu.peak2peak.dto.request.RegisterUserRequestDto;
import com.sdu.peak2peak.dto.response.AuthResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface AuthService {

    void registerUser(RegisterUserRequestDto user);

    AuthResponseDto authenticateUser(AuthRequestDto auth);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;


}
