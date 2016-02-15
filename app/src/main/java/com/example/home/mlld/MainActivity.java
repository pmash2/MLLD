package com.example.home.mlld;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create new helper
        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
        // Get the database. If it does not exist, this is where it will
        // also be created.
        SQLiteDatabase db = dbHelper.getWritableDatabase();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Called when a button is selected on the main menu
    public void openActivity(View view) {
        int id = view.getId();
        Intent intent = new Intent(this, MainActivity.class);

        switch (id) {
            case R.id.button_new_workout:
                intent.setClass(this, NewWorkoutActivity.class);
                break;
            case R.id.button_review_workout:
                intent.setClass(this, ReviewWorkoutsActivity.class);
                break;
            case R.id.button_personal_bests:
                intent.setClass(this, PersonalBestsActivity.class);
                break;
            case R.id.button_maintenance:
                intent.setClass(this, MaintenanceActivity.class);
                break;
            default:
                intent.setClass(this, MainActivity.class);
                break;
        }

        startActivity(intent);
    }
}
