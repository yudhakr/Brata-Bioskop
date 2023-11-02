package com.example.bratabioskop;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        SQLiteOpenHelper starbuzzDatabaseHelper = new BioskopDatabaseHelper(this);
        try {
            db = starbuzzDatabaseHelper.getReadableDatabase();
            cursor = db.query("horror",
                    new String[]{"_id", "NAME"},
                    null, null, null, null, null);
//            db.query("adventure",
//                    new String[]{"_id", "NAME"},
//                    null, null, null, null, null);
//            db.query("scifi",
//                    new String[]{"_id", "NAME"},
//                    null, null, null, null, null);
            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(this,
                    android.R.layout.simple_list_item_1,
                    cursor,
                    new String[]{"NAME"},
                    new int[]{android.R.id.text1},
                    0);
            listDrinks.setAdapter(listAdapter);
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database di Detail unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(DetailActivity.this,
                                InnerActivity.class);
                        intent.putExtra(InnerActivity.EXTRA_DRINKID, (int) id);
                        startActivity(intent);
                    }
                };
        //Assign the listener to the list view
        listDrinks.setOnItemClickListener(itemClickListener);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }

}