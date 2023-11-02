package com.example.bratabioskop;

//import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
//import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";
    int drinkId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner);

        //Get the drink from the intent
        drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
//        Drink drink = Drink.drinks[drinkId];

        //Create a cursor
        SQLiteOpenHelper starbuzzDatabaseHelper = new BioskopDatabaseHelper(this);
        try {
            SQLiteDatabase db = starbuzzDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query ("horror",
                    new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                    "_id = ?",
                    new String[] {Integer.toString(drinkId)},
                    null, null, null);
//             db.query ("adventure",
//                    new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
//                    "_id = ?",
//                    new String[] {Integer.toString(drinkId)},
//                    null, null, null);
//            db.query ("scifi",
//                    new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
//                    "_id = ?",
//                    new String[] {Integer.toString(drinkId)},
//                    null, null, null);

            //Move to the first record in the Cursor
            if (cursor.moveToFirst()) {
                //Get the drink details from the cursor
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                int photoId = cursor.getInt(2);
//                boolean isFavorite = (cursor.getInt(3) == 1);



                //Populate the drink name
                TextView name = (TextView) findViewById(R.id.name);
//        name.setText(drink.getName());
                name.setText(nameText);

                //Populate the drink description
                TextView description = (TextView) findViewById(R.id.description);
//        description.setText(drink.getDescription());
                description.setText(descriptionText);

                //Populate the drink image
                ImageView photo = (ImageView) findViewById(R.id.photo);
//        photo.setImageResource(drink.getImageResourceId());
//        photo.setContentDescription(drink.getName());
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);


            }
            cursor.close();
            db.close();

        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database diInner gaada", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}