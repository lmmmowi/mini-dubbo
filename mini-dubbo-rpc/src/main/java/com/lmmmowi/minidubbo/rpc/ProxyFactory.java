package com.lmmmowi.minidubbo.rpc;

public interface ProxyFactory {

    <T> T getProxy(Invoker<T> invoker, Class<T> interfaceClass);
}
