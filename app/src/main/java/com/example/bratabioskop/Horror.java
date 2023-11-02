package com.example.bratabioskop;

public class Horror {
    private String name;
    private int imageResourceId;
    public static final Horror[] horrors = {
            new Horror("Samira", R.drawable.horrorsatu),
            new Horror("Mata Batin 2", R.drawable.horrordua),
            new Horror("Mayit", R.drawable.horrortiga),
            new Horror("Danur", R.drawable.horrorempat)
    };
    private Horror(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
