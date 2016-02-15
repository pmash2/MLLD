package com.example.home.mlld;

/*
  DatabaseHelper.java
  Contains methods that create and maintain the database and tables
*/

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
    }

    // Method is called during creation of the database
    // Every new table needs a line added here
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DatabaseContract.Exercises.CREATE_TABLE);
    }

    // Method is called during an upgrade of the database
    // Will need to modify accordingly each time update is made
    // Resources: http://stackoverflow.com/questions/8425861/how-do-i-upgrade-a-database-without-removing-the-data-that-the-user-input-in-the
    //   https://androidcookbook.com/Recipe.seam?recipeId=4586
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatabaseContract.Exercises.DELETE_TABLE);
        onCreate(db);
    }
}