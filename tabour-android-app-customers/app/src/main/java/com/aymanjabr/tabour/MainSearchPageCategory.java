package com.aymanjabr.tabour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainSearchPageCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_page_category);

        ImageButton McDonald = findViewById(R.id.mcDonaldImgBtnMSC);
        Button SearchByPopularity = findViewById(R.id.searchPopularityBtnMSC);

        McDonald.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainSearchPageCategory.this,LocationSearchPage.class);
                startActivity(intent);
            }
        });

        SearchByPopularity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainSearchPageCategory.this,MainSearchPagePopularity.class));
            }
        });
    }
}