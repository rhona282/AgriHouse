package ucucite.edu.agrihouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class banana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}