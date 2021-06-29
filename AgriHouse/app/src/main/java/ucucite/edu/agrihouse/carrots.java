package ucucite.edu.agrihouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class carrots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrots);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}