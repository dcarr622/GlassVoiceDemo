package io.glassjournalism.glassgenius;

import com.google.gson.annotations.Expose;

public class SpeechSnippet {

    @Expose
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}