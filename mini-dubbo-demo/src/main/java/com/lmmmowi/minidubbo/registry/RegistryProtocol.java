package com.lmmmowi.minidubbo.registry;

import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;
import com.lmmmowi.minidubbo.rpc.protocol.DefaultProtocol;

public class RegistryProtocol implements Protocol {

    @Override
    public <T> Invoker<T> refer(Class<T> interfaceClass) {
        Protocol protocol = new DefaultProtocol();
        return protocol.refer(interfaceClass);
    }
}
