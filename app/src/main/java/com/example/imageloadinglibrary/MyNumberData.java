package com.example.imageloadinglibrary;

public class MyNumberData {
    private String NumberName;
    private Integer NumberImage;

    public MyNumberData(String numberName, Integer numberImage) {
        NumberName = numberName;
        NumberImage = numberImage;
    }

    public String getNumberName() {
        return NumberName;
    }

    public void setNumberName(String numberName) {
        NumberName = numberName;
    }

    public Integer getNumberImage() {
        return NumberImage;
    }

    public void setNumberImage(Integer numberImage) {
        NumberImage = numberImage;
    }
}
