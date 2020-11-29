package com.aymanjabr.tabour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainSearchPagePopularity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_page_popularity);

        ImageButton McDonald = findViewById(R.id.mcDonaldImgBtnMSP);
        Button SearchByCategory = findViewById(R.id.searchCategoryBtnMSP);

        McDonald.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainSearchPagePopularity.this,LocationSearchPage.class));
            }
        });

        SearchByCategory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainSearchPagePopularity.this,MainSearchPageCategory.class));
            }
        });
    }
}