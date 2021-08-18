package com.lmmmowi.minidubbo.rpc;

public interface Invoker<T> {

    Class<T> getInterface();

    Result invoke(Invocation invocation);
}
