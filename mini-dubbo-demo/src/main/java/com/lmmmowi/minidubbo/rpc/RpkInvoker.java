package com.lmmmowi.minidubbo.rpc;

public class RpkInvoker implements Invoker {

    @Override
    public Result invoke(Invocation invocation) {
        String serviceName = invocation.getServiceName();
        String methodName = invocation.getMethodName();
        Class<?>[] parameterTypes = invocation.getParameterTypes();
        return null;
    }
}
