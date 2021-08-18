package com.lmmmowi.minidubbo.common;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class URL {

    private String schema;
    private Map<String, String> parameters;

    public String getParameter(String key) {
        return parameters.get(key);
    }
}
