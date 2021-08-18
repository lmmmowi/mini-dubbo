package com.lmmmowi.minidubbo.rpc.registry;

import com.lmmmowi.minidubbo.common.URL;

import java.util.List;

public interface Registry {

    List<URL> lookup(URL url);
}
