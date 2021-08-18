package com.lmmmowi.minidubbo.rpc;

public interface Protocol {

    <T> Invoker<T> refer(Class<T> interfaceClass);
}
