package com.cbg.arch.boot.k8s.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.info")
@Getter
@Setter
public class AppInfoConfiguration {
    private String version;

    private AuthorProperties author = new AuthorProperties();
    private ContentProperties content = new ContentProperties();

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class AuthorProperties {
        private String name;
        private String email;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class ContentProperties {
        private String createTime;
        private String updateTime;
        private ContentTypeProperties type = new ContentTypeProperties();
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class ContentTypeProperties {
        private String name;
        private String desc;
    }
}
