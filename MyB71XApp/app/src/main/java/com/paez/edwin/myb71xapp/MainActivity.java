package com.paez.edwin.myb71xapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

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
        if (id == R.id.acercaDe) {
            return true;

        }

        if (id == R.id.menu_buscar) {
            lanzarVistaLugar(null);
            return true;
        }
        return super.onOptionsItemSelected(item);


    }

    public void lanzarVistaLugar(View view) {
       //final EditText entrada = new EditText(this);
       //entrada.setText("0");
        //new AlertDialog.Builder(this)
          //      .setTitle("Selección de lugar")
            //    .setMessage("indica su id:")
              //  .setView(entrada)
                //.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
          //public void onClick(DialogInterface dialog, int whichButton) {
            //            long id = Long.parseLong(entrada.getText().toString());
              //          Intent i = new Intent(MainActivity.this, VistaLugar.class);
                //        i.putExtra("id", id);
                  //      startActivity(i);
                    //}
                //})
                //.setNegativeButton("Cancelar", null)
               //.show();
       Intent i=new Intent (MainActivity.this,VistaLugar.class);
        //i.putExtra("id", (long)0);
        startActivity(i);
    }


}
