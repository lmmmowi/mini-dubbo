package com.lmmmowi.minidubbo.rpc.registry;

import com.lmmmowi.minidubbo.common.URL;
import com.lmmmowi.minidubbo.common.extension.ExtensionLoader;
import com.lmmmowi.minidubbo.common.spi.SPI;
import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;

import java.util.List;

@SPI("registry")
public class RegistryProtocol implements Protocol {

    private static final Registry REGISTRY = ExtensionLoader.getExtensionLoader(Registry.class).getFacade();
    private static final Protocol PROTOCOL = ExtensionLoader.getExtensionLoader(Protocol.class).getFacade();

    @Override
    public <T> Invoker<T> refer(Class<T> interfaceClass, URL registryUrl) {
        List<URL> urls = REGISTRY.lookup(registryUrl);
        URL url = this.choose(urls);
        return PROTOCOL.refer(interfaceClass, url);
    }

    private URL choose(List<URL> urls) {
        return urls.get(0);
    }
}
