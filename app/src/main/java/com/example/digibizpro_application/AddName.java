package com.example.digibizpro_application;

import java.io.Serializable;

public class AddName implements Serializable {
    String strnm,straddnm;

    public AddName(String strnm, String straddnm) {
        this.strnm = strnm;
        this.straddnm = straddnm;
    }

    public String getStrnm() {
        return strnm;
    }

    public void setStrnm(String strnm) {
        this.strnm = strnm;
    }

    public String getStraddnm() {
        return straddnm;
    }

    public void setStraddnm(String straddnm) {
        this.straddnm = straddnm;
    }
}
