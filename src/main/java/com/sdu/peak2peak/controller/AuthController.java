package com.sdu.peak2peak.controller;


import com.sdu.peak2peak.dto.request.AuthRequestDto;
import com.sdu.peak2peak.dto.request.RegisterUserRequestDto;
import com.sdu.peak2peak.dto.response.AuthResponseDto;
import com.sdu.peak2peak.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@Slf4j
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@Valid @ModelAttribute RegisterUserRequestDto registerUserRequestDto){
        authService.registerUser(registerUserRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> loginUser(@Valid @RequestBody AuthRequestDto authRequestDto){
        AuthResponseDto authResponseDto = authService.authenticateUser(authRequestDto);
        return ResponseEntity.ok(authResponseDto);
    }

}
