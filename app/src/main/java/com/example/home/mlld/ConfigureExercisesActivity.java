package com.example.home.mlld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class ConfigureExercisesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_exercises);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_configure_exercises, menu);
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

    public  void saveExercise (View view) {
        EditText exerciseNameInput = (EditText) findViewById(R.id.newExerciseInput);  // Use findViewById() to get the EditText element
        EditText exerciseCodeInput = (EditText) findViewById(R.id.newExerciseCodeInput);
        String exerciseName = exerciseNameInput.getText().toString();                 // Assign the text to a local message variable
        String exerciseCode = exerciseCodeInput.getText().toString();

        // Save it

    }
}
