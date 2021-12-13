package com.example.passelvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
      CircleImageView imgChef,imgDokter,imgFotografer,imgPolisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgChef= (CircleImageView) findViewById(R.id.chef);
        imgDokter = (CircleImageView) findViewById(R.id.dokter);
        imgFotografer = (CircleImageView) findViewById(R.id.fotografer);
        imgPolisi = (CircleImageView) findViewById(R.id.polisi);

        imgChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahChef = new Intent(MainActivity.this, chef.class);
                startActivity(pindahChef);
            }
        });
        imgDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahDokter = new Intent(MainActivity.this, dokter.class);
                startActivity(pindahDokter);
            }
        });
        imgFotografer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahFotografer = new Intent(MainActivity.this,fotograper.class);
                startActivity(pindahFotografer);
            }
        });

        imgPolisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahpolisi = new Intent(MainActivity.this, polisi.class);
                startActivity(pindahpolisi);
            }
        });
    }
}