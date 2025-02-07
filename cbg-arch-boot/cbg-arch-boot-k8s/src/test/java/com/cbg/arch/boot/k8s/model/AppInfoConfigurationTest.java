package com.cbg.arch.boot.k8s.model;

import com.alibaba.fastjson2.JSON;
import com.cbg.arch.boot.k8s.K8SBaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j
class AppInfoConfigurationTest extends K8SBaseTest {
    @Autowired
    private AppInfoConfiguration appInfoConfiguration;

    @Test
    void getAppInfo() {
        log.info(JSON.toJSONString(appInfoConfiguration));
    }
}