package com.paez.edwin.appodm;

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
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:3168318267"));
        startActivity(intent);
    }

    public void mandarCorreo(View view){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
        intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"oscar.ramirez@odmingenieria.com"});
        startActivity(intent);
    }

    }

