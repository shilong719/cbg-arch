package com.cbg.arch.boot.k8s.controller;

import com.alibaba.fastjson2.JSON;
import com.cbg.arch.boot.k8s.model.AppInfoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AutoClose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
@Slf4j
public class SystemController {
    private final AppInfoConfiguration appInfoConfiguration;

    @Autowired
    public SystemController(AppInfoConfiguration appInfoConfiguration) {
        this.appInfoConfiguration = appInfoConfiguration;
    }

    @GetMapping("/app/info")
    public AppInfoConfiguration getAppInfoConfiguration() {
        log.info("AppInfoConfiguration: {}", JSON.toJSONString(appInfoConfiguration));
        return appInfoConfiguration;
    }
}
