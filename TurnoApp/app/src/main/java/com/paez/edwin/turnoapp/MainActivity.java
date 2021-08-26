package com.paez.edwin.turnoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void llamada01(View v) {
        Intent intent01 = new Intent(MainActivity.this,
                llamadaunoActivity.class);
        startActivity(intent01);
    }
    public void llamada02(View v) {
        Intent intent02 = new Intent(MainActivity.this,
                llamadadosActivity.class);
        startActivity(intent02);
    }
    public void llamada03(View v) {
        Intent intent03 = new Intent(MainActivity.this,
                llamadatresActivity.class);
        startActivity(intent03);
    }
    public void llamada04(View v) {
        Intent intent04 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3138883431"));
        startActivity(intent04);
    }
    public void llamada05(View v) {
        Intent intent04 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3138883451"));
        startActivity(intent04);
    }
    public void llamada06(View v) {
        Intent intent06 = new Intent(MainActivity.this,
                llamadaseisActivity.class);
        startActivity(intent06);
    }
    public void llamada07(View v) {
        Intent intent07 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3105953614"));
        startActivity(intent07);
    }
    public void llamada08(View v) {
        Intent intent08 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3105953614"));
        startActivity(intent08);
    }
}
