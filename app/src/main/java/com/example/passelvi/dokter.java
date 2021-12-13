package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dokter extends AppCompatActivity {
    Button btndokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokter);
        btndokter=(Button) findViewById(R.id.btn_dok);

        btndokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtndokter = new Intent(dokter.this,fotodokter.class);
                startActivity(pindahBtndokter);
            }
        });
    }
}