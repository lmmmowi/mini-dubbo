package com.lmmmowi.minidubbo.rpc;

import java.io.Serializable;

public interface Result extends Serializable {

    Object recreate() throws Throwable;
}
