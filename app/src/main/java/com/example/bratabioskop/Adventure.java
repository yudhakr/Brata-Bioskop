package com.example.bratabioskop;

public class Adventure {
    private String name;
    private int imageResourceId;
    public static final Adventure[] adventures = {
            new Adventure("Negeri Cengeng", R.drawable.adventuresatu),
            new Adventure("Lima Senti", R.drawable.adventuredua),
            new Adventure("Dora tidak bodoh lagi", R.drawable.adventuretiga)
    };

    private Adventure(String name, int imageResourceId) {
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
