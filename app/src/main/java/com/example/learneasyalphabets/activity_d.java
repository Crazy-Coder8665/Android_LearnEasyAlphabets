package com.example.learneasyalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }
    public void next(View view) {
        Intent intent = new Intent(this,activity_e.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(this,activity_c.class);
        startActivity(intent);
    }
}