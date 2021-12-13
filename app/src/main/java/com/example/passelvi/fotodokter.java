package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotodokter extends AppCompatActivity {
    Button btnBackfotodokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotodokter);
        btnBackfotodokter=(Button) findViewById((R.id.btn_dk));

        btnBackfotodokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnfotodokter = new Intent(fotodokter.this,MainActivity.class);
                startActivity(pindahBtnfotodokter);
            }
        });
    }
}