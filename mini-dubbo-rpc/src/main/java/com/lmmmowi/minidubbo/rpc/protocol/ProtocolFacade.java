package com.lmmmowi.minidubbo.rpc.protocol;

import com.lmmmowi.minidubbo.common.DubboConstants;
import com.lmmmowi.minidubbo.common.URL;
import com.lmmmowi.minidubbo.common.extension.ExtensionLoader;
import com.lmmmowi.minidubbo.common.spi.SPI;
import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;
import com.lmmmowi.minidubbo.rpc.protocol.http.HttpProtocol;
import com.lmmmowi.minidubbo.rpc.registry.RegistryProtocol;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProtocolFacade implements Protocol {

    private Map<String, Protocol> extensions = new HashMap<>();

    public ProtocolFacade() {
        Arrays.asList(
                new RegistryProtocol(),
                new HttpProtocol()
        ).forEach(protocol -> {
            SPI spi = protocol.getClass().getAnnotation(SPI.class);
            extensions.put(spi.value(), protocol);
        });
    }

    @Override
    public <T> Invoker<T> refer(Class<T> interfaceClass, URL url) {
        String protocolKey = url.getParameter(DubboConstants.PROTOCOL);
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(protocolKey);
        return protocol.refer(interfaceClass, url);
    }
}
