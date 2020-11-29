package com.aymanjabr.tabour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LocationSearchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_search_page);

        ImageButton McDonald = findViewById(R.id.mcDonaldImgBtnLoc);

        McDonald.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LocationSearchPage.this,OrderPage.class));
            }
        });

    }
}