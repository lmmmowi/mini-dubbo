package com.lmmmowi.minidubbo.rpc;

public interface Invocation {

    String getServiceName();

    String getMethodName();

    Class<?>[] getParameterTypes();
}
