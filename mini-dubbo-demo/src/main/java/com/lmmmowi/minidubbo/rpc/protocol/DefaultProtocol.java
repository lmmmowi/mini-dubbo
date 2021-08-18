package com.lmmmowi.minidubbo.rpc.protocol;

import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Protocol;

public class DefaultProtocol implements Protocol {

    @Override
    public <T> Invoker<T> refer(Class<T> interfaceClass) {
        return new DefaultInvoker<>(interfaceClass);
    }
}
