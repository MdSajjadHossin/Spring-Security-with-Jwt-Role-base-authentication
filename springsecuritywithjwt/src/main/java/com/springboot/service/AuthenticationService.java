package com.springboot.service;

import com.springboot.dto.JwtAuthenticationResponse;
import com.springboot.dto.RefreshTokenRequest;
import com.springboot.dto.SignupRequest;
import com.springboot.entity.User;

public interface AuthenticationService {

    User signup(SignupRequest signupRequest);

    JwtAuthenticationResponse signIn(SignupRequest signupRequest);

    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
