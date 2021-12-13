package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotograper extends AppCompatActivity {
    Button btnfotografer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotograper);
        btnfotografer=(Button) findViewById(R.id.btn_ft);

        btnfotografer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnfotografer = new Intent(fotograper.this,fotofotografer.class);
                startActivity(pindahBtnfotografer);
            }
        });
    }
}