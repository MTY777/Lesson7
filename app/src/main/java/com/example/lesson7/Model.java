package com.example.lesson7;

public class Model {
    private int image;
    private String textv_content;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTextv_content() {
        return textv_content;
    }

    public void setTextv_content(String textv_content) {
        this.textv_content = textv_content;
    }

    public String getTextv_data() {
        return textv_data;
    }

    public void setTextv_data(String textv_data) {
        this.textv_data = textv_data;
    }

    public Model(int image, String textv_content, String textv_data) {
        this.image = image;
        this.textv_content = textv_content;
        this.textv_data = textv_data;
    }

    private String textv_data;
}
