package com.lmmmowi.minidubbo.config;

import com.lmmmowi.minidubbo.common.DubboConstants;
import com.lmmmowi.minidubbo.common.URL;
import com.lmmmowi.minidubbo.common.extension.ExtensionLoader;
import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;
import com.lmmmowi.minidubbo.rpc.ProxyFactory;
import com.lmmmowi.minidubbo.rpc.proxy.DefaultProxyFactory;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class ReferenceConfig<T> {

    private static final Protocol PROTOCOL = ExtensionLoader.getExtensionLoader(Protocol.class).getFacade();

    @Setter
    private Class<T> interfaceClass;

    public T get() {
        URL url = this.buildUrl();
        Invoker<T> invoker = PROTOCOL.refer(interfaceClass, url);

        ProxyFactory proxyFactory = new DefaultProxyFactory();
        return proxyFactory.getProxy(invoker, interfaceClass);
    }

    private URL buildUrl() {
        Map<String, String> map = new HashMap<>();
        map.put(DubboConstants.PROTOCOL, "http");
        return new URL("registry", map);
    }
}
