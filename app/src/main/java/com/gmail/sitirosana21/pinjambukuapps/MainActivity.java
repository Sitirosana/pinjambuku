package com.gmail.sitirosana21.pinjambukuapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        Intent mintent = new Intent(MainActivity.this, formdaftar.class);
        startActivity(mintent);
    }

    public void buttonClickPinjam(View view){
        Intent intentpinjam = new Intent(MainActivity.this, daftarbuku.class);
        startActivity(intentpinjam);
    }

}