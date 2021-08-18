package com.lmmmowi.minidubbo.rpc.proxy;

import com.lmmmowi.minidubbo.rpc.Invocation;
import com.lmmmowi.minidubbo.rpc.Invoker;
import com.lmmmowi.minidubbo.rpc.Result;
import com.lmmmowi.minidubbo.rpc.RpkInvocation;
import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
public class DefaultInvocationHandler implements InvocationHandler {

    private Invoker<?> invoker;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, args);
        }

        String serviceName = invoker.getInterface().getName();
        String methodName = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Invocation invocation = new RpkInvocation(serviceName, methodName, parameterTypes, args);

        Result result = invoker.invoke(invocation);
        return result.recreate();
    }
}
