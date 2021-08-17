package com.lmmmowi.minidubbo.demo.consumer;

import com.lmmmowi.minidubbo.config.ReferenceConfig;
import com.lmmmowi.minidubbo.demo.common.HelloService;

public class ConsumerDemo {

    public static void main(String[] args) {
        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setInterfaceClass(HelloService.class);
        HelloService helloService = referenceConfig.get();
        String result = helloService.hello("coder");
        System.out.println(result);
        System.out.println(helloService);
    }
}
