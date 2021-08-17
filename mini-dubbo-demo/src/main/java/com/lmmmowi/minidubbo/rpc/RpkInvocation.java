package com.lmmmowi.minidubbo.rpc;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RpkInvocation implements Invocation {

    private String serviceName;
    private String methodName;
    private Class<?>[] parameterTypes;
    private Object[] arguments;

    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public String getMethodName() {
        return methodName;
    }

    @Override
    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }
}
