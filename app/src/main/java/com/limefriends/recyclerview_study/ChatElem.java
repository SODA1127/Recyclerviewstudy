package com.limefriends.recyclerview_study;


import android.graphics.Bitmap;

import java.io.Serializable;

class ChatElem implements Serializable{
    String name;
    String textContent;

    public ChatElem(String name, String textContent) {
        this.name = name;
        this.textContent = textContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
