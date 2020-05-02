package com.example.heterogeneousrv.Modals;

public class HorizontalModal {

    private String ImageUri;
    private String ImageName;

    public HorizontalModal(String imageUri, String imageName) {
        ImageUri = imageUri;
        ImageName = imageName;
    }

    public String getImageUri() {
        return ImageUri;
    }

    public void setImageUri(String imageUri) {
        ImageUri = imageUri;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }
}
