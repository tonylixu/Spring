package com.zebra.emc.tools.SpringRestWebService;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tqgf87 on 3/21/2017.
 */
// To ignore any unknown properties in JSON input without exception
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Quote{" +
            "type='" + type + '\'' +
            ", value=" + value +
            '}';
    }
}
