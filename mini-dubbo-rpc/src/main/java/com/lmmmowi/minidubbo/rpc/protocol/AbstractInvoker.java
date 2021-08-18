package com.lmmmowi.minidubbo.rpc.protocol;

import com.lmmmowi.minidubbo.rpc.Invoker;

public abstract class AbstractInvoker<T> implements Invoker<T> {

    private Class<T> interfaceClass;

    public AbstractInvoker(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    @Override
    public Class<T> getInterface() {
        return interfaceClass;
    }
}
