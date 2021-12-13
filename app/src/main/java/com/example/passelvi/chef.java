package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chef extends AppCompatActivity {
    Button btnchef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);
        btnchef=(Button) findViewById(R.id.btn_cf);

        btnchef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnchef = new Intent(chef.this,fotochef.class);
                startActivity(pindahBtnchef);
            }
        });
    }
}