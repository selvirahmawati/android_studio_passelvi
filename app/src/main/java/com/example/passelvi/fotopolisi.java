package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotopolisi extends AppCompatActivity {
    Button btnBackfotopolisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotopolisi);
        btnBackfotopolisi=(Button) findViewById(R.id.btn_pol);

      btnBackfotopolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnfotopolisi = new Intent(fotopolisi.this,MainActivity.class);
                startActivity(pindahBtnfotopolisi);
            }
        });
    }
}