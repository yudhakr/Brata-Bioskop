package com.example.bratabioskop;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BioskopDatabaseHelper  extends SQLiteOpenHelper {
    private static final String DB_NAME = "bioskop"; // the name of our database
    private static final int DB_VERSION = 7; // the version of the database

    BioskopDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);

    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
if (oldVersion <1) {
    db.execSQL("CREATE TABLE HORROR (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "NAME TEXT, "
            + "DESCRIPTION TEXT, "
            + "IMAGE_RESOURCE_ID INTEGER);");
    insertHorror(db, "Samira", "Kisah 5 orang mahasiswa yang hendak menelusuri Informasi mengenai dukun ilmu hitam.", R.drawable.horrorsatu);
    insertHorror(db, "Mata Batin 2", "Setelah adiknya meninggal, Alia (Jessica Mila) memutuskan untuk memulai hidup baru dengan tinggal di sebuah panti asuhan milik Bu Laksmi (Sophia Latjuba) dan Pak Fadli (Jeremy Thomas) sekaligus kerja sosial di sana. Tapi Alia merasa ada yang janggal dengan panti itu. Apalagi Nadia (Nabilah Ayu), salah seorang anak panti yang ternyata juga memiliki mata batin terbuka seperti Alia, bisa mendengar suara misterius yang minta tolong dari seluruh dinding rumah. Alia dan Nadia pun membuka sebuah kamar misterius yang terkunci. Sejak itu malapetaka mulai terjadi. Ternyata Alia dan Nadia telah melakakukan kesalahan besar dan membebaskan Darmah (Hadijah Shahab), arwah penuh dendam yang memang sengaja dikunci di kamar itu. Bersama dengan Bu Windu (Citra Prima), paranormal dan pembimbing mata batinnya, Alia harus menghadapi Darmah dan menyelamatkan panti asuhan itu.Tetapi suatu yang aneh ,dia malah selesai dan endingnya penuh menegangkan.[2]",
            R.drawable.horrordua);
    insertHorror(db, "Mayit", "Sebuah dusun diteror oleh iblis bernama Nyai Danan Wati (Alda Augustine) akibat dari pasangan suami istri bernama Koswara (Clift Sangra) dan Sumi (Endah Pitasari) yang merupakan warga dusun tersebut yang melakukan pesugihan di Ringin lawang. Imas (Rachel ex JKT48) adalah anak dari pasangan suami istri tersebut yang merupakan anak dari hasil pesugihan.", R.drawable.horrortiga);
    insertHorror(db, "Danur", "Mengikuti kisah Risa yang bisa berkomunikasi dengan hantu. Masalah timbul saat sang adik, Riri, secara misterius hilang tanpa jejak. Ia pun meminta bantuan pada teman-teman hantunya untuk mencarinya.", R.drawable.horrorempat);

    insertHorror(db, "Negeri Dongeng", "Sebuah film mengenai perjalanan melihat Indonesia, melihat sahabat dan rekanrekan seperjalanan, juga melihat diri sendiri. Negeri Dongeng berkisah mengenai 7 sineas muda Indonesia yang mendaki 7 puncak gunung tertinggi di Nusantara berbekal 7 buah kamera, bersama-sama. \"Dan mencintai tanah air Indonesia dapat ditumbuhkan dengan mengenal Indonesia bersama rakyatnya dari dekat. ", R.drawable.adventuresatu);
    insertHorror(db, "Lima Senti", " Selama tiga bulan berpisah penuh kerinduan, banyak yang terjadi dalam kehidupan mereka berlima, sesuatu yang mengubah diri mereka masing-masing untuk lebih baik dalam menjalani kehidupan.",
            R.drawable.adventuredua);
    insertHorror(db, "Dora Tidak Bodoh Lagi", "Dora yang selalu bertanya tanpa mencari sesuatu dengan memakai matanya sendiri, setelah ditampol nitijen akhirnya dia tidak bodoh lagi", R.drawable.adventuretiga);

    insertHorror(db, "Tengkorak", "Sebuah kerangka fosil humanoid berusia 170.000 tahun, panjang 1.850 meter ditemukan selama gempa bumi 2006 di Yogyakarta.", R.drawable.scifisatu);
    insertHorror(db, "Bapack Bapack Sulap", "The Mentalist menceritakan tentang pemecahan setiap kasus pembunuhan yang terjadi di daerah California.", R.drawable.scifidua);
    insertHorror(db, "Rafathar Bocil Hoki", "Jonny Gold dan Popo Palupi adalah sepasang perampok profesional. Kali ini mereka mendapat pekerjaan untuk menculik bayi bernama Rafathar, seorang anak yang diadopsi oleh keluarga kaya.", R.drawable.scifitiga);
}
if (oldVersion <7){

    db.execSQL("CREATE TABLE MOVIES (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "NAME TEXT, "
            + "DESCRIPTION TEXT, "
            + "IMAGE_RESOURCE_ID INTEGER);");
    insertHorror(db, "Samira", "Kisah 5 orang mahasiswa yang hendak menelusuri Informasi mengenai dukun ilmu hitam.", R.drawable.horrorsatu);
    insertHorror(db, "Mata Batin 2", "Setelah adiknya meninggal, Alia (Jessica Mila) memutuskan untuk memulai hidup baru dengan tinggal di sebuah panti asuhan milik Bu Laksmi (Sophia Latjuba) dan Pak Fadli (Jeremy Thomas) sekaligus kerja sosial di sana. Tapi Alia merasa ada yang janggal dengan panti itu. Apalagi Nadia (Nabilah Ayu), salah seorang anak panti yang ternyata juga memiliki mata batin terbuka seperti Alia, bisa mendengar suara misterius yang minta tolong dari seluruh dinding rumah. Alia dan Nadia pun membuka sebuah kamar misterius yang terkunci. Sejak itu malapetaka mulai terjadi. Ternyata Alia dan Nadia telah melakakukan kesalahan besar dan membebaskan Darmah (Hadijah Shahab), arwah penuh dendam yang memang sengaja dikunci di kamar itu. Bersama dengan Bu Windu (Citra Prima), paranormal dan pembimbing mata batinnya, Alia harus menghadapi Darmah dan menyelamatkan panti asuhan itu.Tetapi suatu yang aneh ,dia malah selesai dan endingnya penuh menegangkan.[2]",
            R.drawable.horrordua);
    insertHorror(db, "Mayit", "Sebuah dusun diteror oleh iblis bernama Nyai Danan Wati (Alda Augustine) akibat dari pasangan suami istri bernama Koswara (Clift Sangra) dan Sumi (Endah Pitasari) yang merupakan warga dusun tersebut yang melakukan pesugihan di Ringin lawang. Imas (Rachel ex JKT48) adalah anak dari pasangan suami istri tersebut yang merupakan anak dari hasil pesugihan.", R.drawable.horrortiga);
    insertHorror(db, "Danur", "Mengikuti kisah Risa yang bisa berkomunikasi dengan hantu. Masalah timbul saat sang adik, Riri, secara misterius hilang tanpa jejak. Ia pun meminta bantuan pada teman-teman hantunya untuk mencarinya.", R.drawable.horrorempat);

    insertHorror(db, "Negeri Dongeng", "Sebuah film mengenai perjalanan melihat Indonesia, melihat sahabat dan rekanrekan seperjalanan, juga melihat diri sendiri. Negeri Dongeng berkisah mengenai 7 sineas muda Indonesia yang mendaki 7 puncak gunung tertinggi di Nusantara berbekal 7 buah kamera, bersama-sama. \"Dan mencintai tanah air Indonesia dapat ditumbuhkan dengan mengenal Indonesia bersama rakyatnya dari dekat. ", R.drawable.adventuresatu);
    insertHorror(db, "Lima Senti", " Selama tiga bulan berpisah penuh kerinduan, banyak yang terjadi dalam kehidupan mereka berlima, sesuatu yang mengubah diri mereka masing-masing untuk lebih baik dalam menjalani kehidupan.",
            R.drawable.adventuredua);
    insertHorror(db, "Dora Tidak Bodoh Lagi", "Dora yang selalu bertanya tanpa mencari sesuatu dengan memakai matanya sendiri, setelah ditampol nitijen akhirnya dia tidak bodoh lagi", R.drawable.adventuretiga);

    insertHorror(db, "Tengkorak", "Sebuah kerangka fosil humanoid berusia 170.000 tahun, panjang 1.850 meter ditemukan selama gempa bumi 2006 di Yogyakarta.", R.drawable.scifisatu);
    insertHorror(db, "Bapack Bapack Sulap", "The Mentalist menceritakan tentang pemecahan setiap kasus pembunuhan yang terjadi di daerah California.", R.drawable.scifidua);
    insertHorror(db, "Rafathar Bocil Hoki", "Jonny Gold dan Popo Palupi adalah sepasang perampok profesional. Kali ini mereka mendapat pekerjaan untuk menculik bayi bernama Rafathar, seorang anak yang diadopsi oleh keluarga kaya.", R.drawable.scifitiga);


}

//        db.execSQL("CREATE TABLE adventure (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
//                + "NAME TEXT, "
//                + "DESCRIPTION TEXT, "
//                + "IMAGE_RESOURCE_ID INTEGER);");
//        insertAdventure(db, "Negeri Dongeng", "Sebuah film mengenai perjalanan melihat Indonesia, melihat sahabat dan rekanrekan seperjalanan, juga melihat diri sendiri. Negeri Dongeng berkisah mengenai 7 sineas muda Indonesia yang mendaki 7 puncak gunung tertinggi di Nusantara berbekal 7 buah kamera, bersama-sama. \"Dan mencintai tanah air Indonesia dapat ditumbuhkan dengan mengenal Indonesia bersama rakyatnya dari dekat. ", R.drawable.adventuresatu);
//        insertAdventure(db, "Lima Senti", " Selama tiga bulan berpisah penuh kerinduan, banyak yang terjadi dalam kehidupan mereka berlima, sesuatu yang mengubah diri mereka masing-masing untuk lebih baik dalam menjalani kehidupan.",
//                R.drawable.adventuredua);
//        insertAdventure(db, "Dora Tidak Bodoh Lagi", "Dora yang selalu bertanya tanpa mencari sesuatu dengan memakai matanya sendiri, setelah ditampol nitijen akhirnya dia tidak bodoh lagi", R.drawable.adventuretiga);
//
//        db.execSQL("CREATE TABLE scifi (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
//                + "NAME TEXT, "
//                + "DESCRIPTION TEXT, "
//                + "IMAGE_RESOURCE_ID INTEGER);");
//        insertScifi(db, "Tengkorak", "Sebuah kerangka fosil humanoid berusia 170.000 tahun, panjang 1.850 meter ditemukan selama gempa bumi 2006 di Yogyakarta.", R.drawable.scifisatu);
//        insertScifi(db, "Bapack Bapack Sulap", "The Mentalist menceritakan tentang pemecahan setiap kasus pembunuhan yang terjadi di daerah California.", R.drawable.scifidua);
//        insertScifi(db, "Rafathar Bocil Hoki", "Jonny Gold dan Popo Palupi adalah sepasang perampok profesional. Kali ini mereka mendapat pekerjaan untuk menculik bayi bernama Rafathar, seorang anak yang diadopsi oleh keluarga kaya.", R.drawable.scifitiga);

    }


    //    insert data sekali banyak(Multiple insert)
    private static void insertHorror(SQLiteDatabase db,
                                     String name,
                                     String description,
                                     int resourceId) {
        ContentValues  horrorValues = new ContentValues();
        horrorValues.put("NAME", name);
        horrorValues.put("DESCRIPTION", description);
        horrorValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("horror", null,  horrorValues);
    }
    private static void insertAdventure(SQLiteDatabase db,
                                        String name,
                                        String description,
                                        int resourceId) {
        ContentValues adValues = new ContentValues();
        adValues.put("NAME", name);
        adValues.put("DESCRIPTION", description);
        adValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("adventure", null, adValues);
    }
    private static void insertScifi(SQLiteDatabase db,
                                    String name,
                                    String description,
                                    int resourceId) {
        ContentValues sciValues = new ContentValues();
        sciValues.put("NAME", name);
        sciValues.put("DESCRIPTION", description);
        sciValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("scifi", null, sciValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }



}
