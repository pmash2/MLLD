package com.example.home.mlld;

/*
  DatabaseContract.java
  Contract class that specifies the layout of the database schema
  Idea came from http://stackoverflow.com/questions/17451931/how-to-use-a-contract-class-in-android
  See notes at bottom for more info
*/

import android.provider.BaseColumns;

public final class DatabaseContract {
    public  static final int    DATABASE_VERSION = 1;
    public  static final String DATABASE_NAME    = "mlld.db";
    private static final String TEXT_TYPE        = " TEXT";
    private static final String COMMA_SEP        = ",";

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private DatabaseContract() {}

    // Exercises table
    public static abstract class Exercises implements BaseColumns {
        public static final String TABLE_NAME              = "Exercises";
        public static final String COLUMN_NAME_CODE        = "ex_Code";
        public static final String COLUMN_NAME_DESCRIPTION = "ex_Description";


        // SQL statement to create the table
        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE_NAME + " (" +
                _ID + " INTEGER PRIMARY KEY," +
                COLUMN_NAME_CODE        + TEXT_TYPE + COMMA_SEP +
                COLUMN_NAME_DESCRIPTION + TEXT_TYPE + " )";

        // SQL statement to delete the table
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

}

/*
  ************NOTES*************
  - Any time a change is made to the schema, the DATABASE_VERSION needs to be updated
	- The changes need to be accounted for in the onCreate and onUpgrade functions in DatabaseHelper.java

  - To add a new column to a table:
    - Add this: public static final String COLUMN_NAME_[FIELDNAME] = "[FIELDNAME]";
	- Add that variable to the CREATE_TABLE statement for that table as well
*/