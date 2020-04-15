package com.aoher.config;

import com.aoher.service.impl.SecurityUserDetailService;
import com.aoher.util.EncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class MultiHttpSecurityConfig {

    @Autowired
    private SecurityUserDetailService securityUserDetailService;

    @Autowired
    private EncryptionUtil encryptionUtil;
}
