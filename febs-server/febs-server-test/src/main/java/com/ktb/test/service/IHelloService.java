package com.ktb.test.service;

import com.ktb.common.entity.FebsServerConstant;
import com.ktb.test.service.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = FebsServerConstant.FEBS_SERVER_SYSTEM, contextId = "helloServiceClient", fallbackFactory = HelloServiceFallback .class)
public interface IHelloService {

    @GetMapping("hello")
    String hello(@RequestParam String name);
}
