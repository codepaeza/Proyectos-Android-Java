package com.paez.edwin.turnoapp;

/**
 * Created by PC on 28/12/2017.
 */
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;

public class llamadaseisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llamada_seis);
    }
    public void llamada61(View v) {
        Intent intent61 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3112384331"));
        startActivity(intent61);
    }
    public void llamada62(View v) {
        Intent intent62 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3112421964"));
        startActivity(intent62);
    }
    public void llamada63(View v) {
        Intent intent63 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3103084120"));
        startActivity(intent63);
    }
}
