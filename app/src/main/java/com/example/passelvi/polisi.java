package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class polisi extends AppCompatActivity {
    Button btnpolisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polisi);
        btnpolisi=(Button) findViewById(R.id.btn_pl);

        btnpolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnpolisi = new Intent(polisi.this,fotopolisi.class);
                startActivity(pindahBtnpolisi);
            }
        });
    }
}