package io.github.toquery.example.spring.security.oauth2.opaquetoken.core.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Slf4j
@Setter
@Getter
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private AppOAuth2Properties oauth2 = new AppOAuth2Properties();


    @Setter
    @Getter
    public static final class AppOAuth2Properties {
        /**
         * SSO系统地址，可不配
         */
        private String domain;

        /**
         * OAuth2 登录成功后跳转系统地址
         */
        private String redirectUri;

        private List<String> authorizedRedirectUris = new ArrayList<>();
    }
}
