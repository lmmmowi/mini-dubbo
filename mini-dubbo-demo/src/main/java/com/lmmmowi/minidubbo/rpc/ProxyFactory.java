package com.lmmmowi.minidubbo.rpc;

public interface ProxyFactory {

    <T> T getProxy(Class<T> interfaceClass);
}
