package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hesap_Makinesi extends AppCompatActivity {

    EditText birinci;
    EditText ikinci;
    EditText output;
    Button topla;
    Button cikar;
    Button bol;
    Button carp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesap__makinesi);

        birinci = findViewById(R.id.first);
        ikinci = findViewById(R.id.second);
        topla = findViewById(R.id.topla);
        cikar = findViewById(R.id.cikar);
        bol = findViewById(R.id.bol);
        carp = findViewById(R.id.carp);

        output = findViewById(R.id.result);

        // Topla

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sayi1,sayi2,sonuc;
                sayi1 = Float.parseFloat(birinci.getText().toString());
                sayi2 = Float.parseFloat(ikinci.getText().toString());
                sonuc = sayi1 + sayi2;
                output.setText(String.valueOf(sonuc));

            }
        });

        // Cikar

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sayi1,sayi2,sonuc;
                sayi1 = Float.parseFloat(birinci.getText().toString());
                sayi2 = Float.parseFloat(ikinci.getText().toString());
                sonuc = sayi1 - sayi2;
                output.setText(String.valueOf(sonuc));

            }
        });

        // Carp

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sayi1,sayi2,sonuc;
                sayi1 = Float.parseFloat(birinci.getText().toString());
                sayi2 = Float.parseFloat(ikinci.getText().toString());
                sonuc = sayi1 * sayi2;
                output.setText(String.valueOf(sonuc));

            }
        });

        // Bol

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sayi1,sayi2,sonuc;
                sayi1 = Float.parseFloat(birinci.getText().toString());
                sayi2 = Float.parseFloat(ikinci.getText().toString());
                sonuc = sayi1 / sayi2;
                output.setText(String.valueOf(sonuc));

            }
        });

    }


}