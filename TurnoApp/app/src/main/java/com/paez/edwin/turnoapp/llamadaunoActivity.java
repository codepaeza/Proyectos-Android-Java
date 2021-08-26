package com.paez.edwin.turnoapp;

/**
 * Created by PC on 28/12/2017.
 */

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class llamadaunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llamada_uno);
    }
    public void llamada11(View v) {
        Intent intent11 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:0316016628"));
        startActivity(intent11);
    }
    public void llamada12(View v) {
        Intent intent12 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:0316085858"));
        startActivity(intent12);
    }
    public void llamada13(View v) {
        Intent intent13 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:0316085858"));
        startActivity(intent13);
    }
    public void llamada14(View v) {
        Intent intent14 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3108697343"));
        startActivity(intent14);
    }
    public void llamada15(View v) {
        Intent intent15 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3217994914"));
        startActivity(intent15);
    }
    public void llamada16(View v) {
        Intent intent16 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:310690006"));
        startActivity(intent16);
    }
    public void llamada17(View v) {
        Intent intent17 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3164259722"));
        startActivity(intent17);
    }
    public void llamada18(View v) {
        Intent intent18 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3187123463"));
        startActivity(intent18);
    }
}
