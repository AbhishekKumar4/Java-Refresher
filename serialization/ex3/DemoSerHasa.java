package com.abhishek.serialization.hasa;

import java.io.Serializable;

public class DemoSerHasa {

    public String anyString;

    public DemoSerHasa(String anyString) {
        this.anyString = anyString;
    }

    public String getAnyString() {
        return anyString;
    }

    public void setAnyString(String anyString) {
        this.anyString = anyString;
    }
}
