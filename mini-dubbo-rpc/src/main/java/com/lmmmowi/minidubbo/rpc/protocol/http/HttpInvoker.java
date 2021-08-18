package com.lmmmowi.minidubbo.rpc.protocol.http;

import com.lmmmowi.minidubbo.rpc.Invocation;
import com.lmmmowi.minidubbo.rpc.Result;
import com.lmmmowi.minidubbo.rpc.RpcResult;
import com.lmmmowi.minidubbo.rpc.protocol.AbstractInvoker;

public class HttpInvoker<T> extends AbstractInvoker<T> {

    public HttpInvoker(Class<T> interfaceClass) {
        super(interfaceClass);
    }

    @Override
    public Result invoke(Invocation invocation) {
        String serviceName = invocation.getServiceName();
        String methodName = invocation.getMethodName();
        Class<?>[] parameterTypes = invocation.getParameterTypes();
        return new RpcResult("result from default invoker");
    }
}
