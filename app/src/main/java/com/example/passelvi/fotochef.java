package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotochef extends AppCompatActivity {
    Button btnBackChef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotochef);
        btnBackChef=(Button) findViewById(R.id.btn_fotocf);

        btnBackChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnfotochef = new Intent(fotochef.this,MainActivity.class);
                startActivity(pindahBtnfotochef);
;            }
        });
    }
}