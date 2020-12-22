package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

public class Liste extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);

        lv = (ListView) findViewById(R.id.userList);

        String values[] = {"Erwin Rommel","Patton","Heinz Guderian",
                "Obengruppenführer Stauffenberg",
                "Bernard Montgomery","Dwight D. Eisenhower"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Arrays.asList(values));

        lv.setAdapter(arrayAdapter);
    }
}