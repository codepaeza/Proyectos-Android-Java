package com.paez.edwin.crisapp;

/**
 * Created by PC on 17/09/2017.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by PC on 29/08/2017.
 */

public class SolicitarActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solicitar_servicio);
    }

    public void llamadaTelefono(View view){
        Intent intent1=new Intent(Intent.ACTION_CALL, Uri.parse("tel:3008762431"));
        startActivity(intent1);
    }

    public void llamadaTelefono2(View view){
        Intent intent2=new Intent(Intent.ACTION_CALL, Uri.parse("tel:3213875100"));
        startActivity(intent2);
    }

}

