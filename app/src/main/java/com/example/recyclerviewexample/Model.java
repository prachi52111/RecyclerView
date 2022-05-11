package com.example.recyclerviewexample;

public class Model {
    private String Name;
    private int imgProfile;

    public Model(String name, int imgProfile) {
        Name = name;
        this.imgProfile = imgProfile;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }


}
