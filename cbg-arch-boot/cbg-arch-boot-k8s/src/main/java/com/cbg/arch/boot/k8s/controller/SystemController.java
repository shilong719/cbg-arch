package com.cbg.arch.boot.k8s.controller;

import com.cbg.arch.boot.k8s.model.AppInfoConfiguration;
import org.junit.jupiter.api.AutoClose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {
    private final AppInfoConfiguration appInfoConfiguration;

    @Autowired
    public SystemController(AppInfoConfiguration appInfoConfiguration) {
        this.appInfoConfiguration = appInfoConfiguration;
    }

    @GetMapping("/app/info")
    public AppInfoConfiguration getAppInfoConfiguration() {
        return appInfoConfiguration;
    }
}
