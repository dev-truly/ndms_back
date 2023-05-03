package com.satech.ndms.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final Map<String, String> authKeyMap = new HashMap<>();
    private final int KEY_LENGTH = 36;

    public String getAuthKey(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        String authKey = authKeyMap.get(ip);
        if (authKey == null) {
            authKey = generateAuthKey();
            authKeyMap.put(ip, authKey);
        }
        return authKey;
    }

    private String generateAuthKey() {
        return UUID.randomUUID().toString().substring(0, KEY_LENGTH);
    }
}

