package com.lmmmowi.minidubbo.config;

import lombok.Setter;

public class ServiceConfig<T> {

    @Setter
    private Class<T> interfaceClass;

    @Setter
    private T ref;

    public void export() {

    }
}
