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

public class llamadatresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llamada_tres);
    }
    public void llamada31(View v) {
        Intent intent31 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3115039243"));
        startActivity(intent31);
    }
    public void llamada32(View v) {
        Intent intent32 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3134360491"));
        startActivity(intent32);
    }

}
