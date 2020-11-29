package com.aymanjabr.tabour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        Button OrderBtn = findViewById(R.id.orderBtnOP);
        Button QuickOrderBtn = findViewById(R.id.quickOrderBtnOP);

        OrderBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(OrderPage.this,Ticket.class));
            }
        });

        QuickOrderBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(OrderPage.this,QuickOrderPage.class));
            }
        });
    }
}