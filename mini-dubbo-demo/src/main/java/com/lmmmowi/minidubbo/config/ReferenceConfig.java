package com.lmmmowi.minidubbo.config;

import com.lmmmowi.minidubbo.rpc.ProxyFactory;
import com.lmmmowi.minidubbo.rpc.proxy.DefaultProxyFactory;
import lombok.Setter;

public class ReferenceConfig<T> {

    @Setter
    private Class<T> interfaceClass;

    public T get() {
        ProxyFactory proxyFactory = new DefaultProxyFactory();
        return proxyFactory.getProxy(interfaceClass);
    }
}
