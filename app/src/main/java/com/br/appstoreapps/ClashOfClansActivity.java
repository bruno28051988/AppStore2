package com.br.appstoreapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClashOfClansActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clash_of_clans);
    }
    public void voltarMain(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

}