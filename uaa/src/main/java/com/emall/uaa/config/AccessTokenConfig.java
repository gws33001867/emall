package com.emall.uaa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * @author lance
 * @date 2022/1/26 11:11 下午
 */
@Configuration
public class AccessTokenConfig {

    @Bean
    TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }
}
