package com.lmmmowi.minidubbo.rpc;

import com.lmmmowi.minidubbo.common.URL;

public interface Protocol {

    <T> Invoker<T> refer(Class<T> interfaceClass, URL url);
}
