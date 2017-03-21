package com.zebra.emc.tools.SpringRestWebService;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Tony Li Xu on 3/21/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    public Long id;
    private String quote;

    public Value() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    @Override
    public String toString() {
        return "Value{" +
            "id=" + id +
            ", quote='" + quote + '\'' +
            '}';
    }
}
