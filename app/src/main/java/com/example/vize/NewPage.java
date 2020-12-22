package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewPage extends AppCompatActivity {

    private RadioGroup faizradioGroup;

    private RadioButton yuzdebir;
    private RadioButton yuzdeiki;
    private RadioButton yuzdebes;

    private Button hesaplaButton;

    private EditText kreditaksitSayi;
    private EditText taksitSayisi;
    private EditText taksitSonuc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_page);

        kreditaksitSayi= (EditText) findViewById(R.id.kreditaksit);
        taksitSayisi= (EditText) findViewById(R.id.taksitsayi);
        taksitSonuc= (EditText) findViewById(R.id.kreditutarsonuc);
        faizradioGroup = (RadioGroup) findViewById(R.id.faizradioGroup);



        Intent intent=getIntent();
        int colorCode=intent.getIntExtra("backgroundColor", Color.WHITE);
        getWindow().getDecorView().setBackgroundColor(colorCode);
    }

    public void KrediHesapla(View v){
        double krediTaksit=Double.parseDouble(kreditaksitSayi.getText().toString());
        double taksitSayi=Double.parseDouble(taksitSayisi.getText().toString());
        double faizOran=0;
        int secilenFaiz=faizradioGroup.getCheckedRadioButtonId();

        switch (secilenFaiz){
            case(R.id.yuzdebir):
                faizOran = 0.01;
                break;

            case(R.id.yuzdeiki):
                faizOran = 0.02;
                break;

            case(R.id.yuzdebes):
                faizOran = 0.05;
                break;

            default:
                Toast.makeText(getApplicationContext(),"Faiz oranı seçilmedi",Toast.LENGTH_LONG).show();
                break;
        }

        // double sonuc = krediTaksit * ((faizOran*(1+Math.pow(faizOran,taksitSayi)))/((1+Math.pow(faizOran,taksitSayi)-1)));
        double us = Math.pow(faizOran,taksitSayi);
        double birFazlasi = 1 + us;
        double sonuc = krediTaksit * ((faizOran * birFazlasi)/(us));
        taksitSonuc.setText(String.valueOf(sonuc));
    }

    public void HesapMakGit(View v) {
        Intent intent = new Intent(this, Hesap_Makinesi.class);
        startActivity(intent);
    }

    public void ListGit(View v) {
        Intent intent = new Intent(this, Liste.class);
        startActivity(intent);
    }

}