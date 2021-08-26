package com.paez.edwin.crisapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.config) {
            lanzarSolicitarActivity(null);
            return true;

        }

        if (id == R.id.acercaDe) {
            lanzarTomarFotoActivity(null);
            return true;

        }

        if (id == R.id.menu_buscar) {
            lanzarOpcionesmenuActivity(null);
            return true;
        }
        return super.onOptionsItemSelected(item);


    }

    public void lanzarOpcionesmenuActivity(View view) {

        Intent i=new Intent (MainActivity.this,OpcionesmenuActivity.class);

        startActivity(i);
    }
    public void lanzarSolicitarActivity(View view) {

        Intent j = new Intent(MainActivity.this, SolicitarActivity.class);
        startActivity(j);
    }

    public void lanzarTomarFotoActivity(View view) {

        Intent k = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(k);
    }
}



