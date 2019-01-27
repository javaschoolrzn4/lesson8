package com.javarzn.reflection.base;

import java.io.Serializable;

public class TheCat extends Cats implements Serializable, Cloneable {
    public static final String NAME = "Mr.Cat";
    protected String eyesColor = "Желтые";
    private String voice = "МЯУ";

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public TheCat() {
    }

    public TheCat(String voice) {
        this.voice = voice;
    }

    public TheCat(String voice, String emptyParam) {
        this.voice = voice;
    }
}
