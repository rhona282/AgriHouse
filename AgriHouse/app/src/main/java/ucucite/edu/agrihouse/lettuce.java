package ucucite.edu.agrihouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class lettuce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lettuce);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}