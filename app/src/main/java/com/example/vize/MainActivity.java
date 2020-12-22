package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText kullaniciAd;
    private EditText sifre;
    private RadioGroup radioGroup;
    private RadioButton acikButton;
    private RadioButton koyuButton;

    Register Ogulcan = new Register("Ogulcan", "ich_liebe_frauen", 1, "/ogulcan", new Date(), 300);
    Register Robert = new Register("Robert", "ich_liebe_krieg", 2, "/robert", new Date(), 300);
    Register Stannis = new Register("Stannis", "ich_liebe_krieg", 3, "/stannis", new Date(), 300);
    Register Tywin = new Register("Tywin", "ich_liebe_verheiraten", 4, "/tywin", new Date(), 300);


    Register[] kullanicilar = new Register[]{
            Ogulcan,
            Robert,
            Stannis,
            Tywin
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.giris_button); // Android deki bütün view ların base sınıfı
        kullaniciAd = (EditText) findViewById(R.id.User);
        sifre = (EditText) findViewById(R.id.Password);
        radioGroup = (RadioGroup) findViewById(R.id.group);
        acikButton = (RadioButton) findViewById(R.id.acik);
        koyuButton = (RadioButton) findViewById(R.id.koyu);



    }

    public void openSecondActivity(View v) {
        String ad = kullaniciAd.getText().toString();
        String password = sifre.getText().toString();

        for (int i=0;i<kullanicilar.length;i++) {
            if (ad.equals(kullanicilar[i].getUsername()) && password.equals(kullanicilar[i].getPassword())) {
                Intent intent = new Intent(this, NewPage.class);
                String backgroundColor="backgroundColor";
                int secilenRadio = radioGroup.getCheckedRadioButtonId();
                switch(secilenRadio){
                    case(R.id.acik):
                        intent.putExtra(backgroundColor, Color.WHITE);
                        break;

                    case(R.id.koyu):
                        intent.putExtra(backgroundColor, Color.GRAY);
                        break;

                    default:
                        break;
                }

                startActivity(intent);
                break;
            }

            else {
                if (i == kullanicilar.length-1) {
                    Toast.makeText(getApplicationContext(), "Yanlış şifre veya kullanıcı adı", Toast.LENGTH_LONG).show();
                    break;
                }
            }

        }
    }
}






