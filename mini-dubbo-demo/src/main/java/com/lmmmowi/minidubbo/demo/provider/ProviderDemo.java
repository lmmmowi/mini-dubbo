package com.lmmmowi.minidubbo.demo.provider;

import com.lmmmowi.minidubbo.config.ServiceConfig;
import com.lmmmowi.minidubbo.demo.common.HelloService;
import com.lmmmowi.minidubbo.demo.common.HelloServiceImpl;

public class ProviderDemo {

    public static void main(String[] args) throws Exception {
        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterfaceClass(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());
        serviceConfig.export();
        System.in.read();
    }
}
