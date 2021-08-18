package com.lmmmowi.minidubbo.config;

import com.lmmmowi.minidubbo.registry.RegistryProtocol;
import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;
import com.lmmmowi.minidubbo.rpc.ProxyFactory;
import com.lmmmowi.minidubbo.rpc.proxy.DefaultProxyFactory;
import lombok.Setter;

public class ReferenceConfig<T> {

    @Setter
    private Class<T> interfaceClass;

    public T get() {
        Protocol protocol = new RegistryProtocol();
        Invoker<T> invoker = protocol.refer(interfaceClass);

        ProxyFactory proxyFactory = new DefaultProxyFactory();
        return proxyFactory.getProxy(invoker, interfaceClass);
    }
}
