package com.mkyong.rest;

public class SoicalWork {
    private int socialPhotos;
    private String socialInformation;
    private String socialDate;

    public String getSocialDate() {
        return socialDate;
    }

    public void setSocialDate(String socialDate) {
        this.socialDate = socialDate;
    }

    public String getSocialInformation() {
        return socialInformation;
    }

    public void setSocialInformation(String socialInformation) {
        this.socialInformation = socialInformation;
    }

    public int getSocialPhotos() {
        return socialPhotos;
    }

    public void setSocialPhotos(int socialPhotos) {
        this.socialPhotos = socialPhotos;
    }

}
