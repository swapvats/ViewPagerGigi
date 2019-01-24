package com.example.viewpagergigi;

public class Chitra {
    int photoId;
    String photoText;

    public Chitra(int photoId, String photoText) {
        this.photoId = photoId;
        this.photoText = photoText;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getPhotoText() {
        return photoText;
    }

    public void setPhotoText(String photoText) {
        this.photoText = photoText;
    }
}
