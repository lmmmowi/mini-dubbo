package com.lmmmowi.minidubbo.rpc;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RpcResult implements Result {

    private Object value;

    @Override
    public Object recreate() throws Throwable {
        return value;
    }
}
