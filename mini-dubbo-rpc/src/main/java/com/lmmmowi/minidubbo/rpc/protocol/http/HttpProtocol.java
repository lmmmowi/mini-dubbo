package com.lmmmowi.minidubbo.rpc.protocol.http;

import com.lmmmowi.minidubbo.common.URL;
import com.lmmmowi.minidubbo.common.spi.SPI;
import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;

@SPI("http")
public class HttpProtocol implements Protocol {

    @Override
    public <T> Invoker<T> refer(Class<T> interfaceClass, URL url) {
        return new HttpInvoker<>(interfaceClass);
    }
}
