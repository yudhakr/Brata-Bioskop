package com.example.bratabioskop;

public class Scifi {
    private String name;
    private int imageResourceId;
    public static final Scifi[] scifis = {
            new Scifi("Tengkorak", R.drawable.scifisatu),
            new Scifi("Bapack Bapack Sulap", R.drawable.scifidua),
            new Scifi("Rafathar Bocil Hoki", R.drawable.scifitiga)
    };
    private Scifi(String name, int imageResourceId) {
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
