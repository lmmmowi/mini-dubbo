package com.lmmmowi.minidubbo.rpc.proxy;

import com.lmmmowi.minidubbo.rpc.ProxyFactory;

import java.lang.reflect.Proxy;

public class DefaultProxyFactory implements ProxyFactory {

    @Override
    public <T> T getProxy(Class<T> interfaceClass) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = new Class[]{interfaceClass};
        return (T) Proxy.newProxyInstance(classLoader, interfaces, new DefaultInvocationHandler(interfaceClass));
    }
}
