package com.example.bratabioskop;

public class Popular {
    private String name;
    private int imageResourceId;
    public static final Popular[] populars = {
            new Popular("DANUR", R.drawable.horrorempat),
            new Popular("DORA TIDAK BODOH LAGI", R.drawable.adventuretiga),
            new Popular("RAFATHAR BOCIL HOKI", R.drawable.scifitiga)
    };
    private Popular(String name, int imageResourceId) {
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
