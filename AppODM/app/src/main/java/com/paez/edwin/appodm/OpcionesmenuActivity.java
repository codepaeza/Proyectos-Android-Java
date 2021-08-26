package com.paez.edwin.appodm;

/**
 * Created by PC on 28/08/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class OpcionesmenuActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones_menu);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1 = (RadioButton) findViewById(R.id.opcion1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.opcion2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.opcion3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.opcion4);
        RadioButton rb5 = (RadioButton) findViewById(R.id.opcion5);
        RadioButton rb6 = (RadioButton) findViewById(R.id.opcion6);
        RadioButton rb7 = (RadioButton) findViewById(R.id.opcion7);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.opcion1:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb2.setTypeface(null, Typeface.NORMAL);
                rb3.setTypeface(null, Typeface.NORMAL);
                rb4.setTypeface(null, Typeface.NORMAL);
                rb5.setTypeface(null, Typeface.NORMAL);
                rb6.setTypeface(null, Typeface.NORMAL);
                rb7.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent1 = new Intent(OpcionesmenuActivity.this,
                MenuunoActivity.class);
                startActivity(intent1);


                Toast toast1 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Redes Eléctricas", Toast.LENGTH_LONG);
                toast1.show();
                break;

            case R.id.opcion2:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb2.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1.setTypeface(null, Typeface.NORMAL);
                rb3.setTypeface(null, Typeface.NORMAL);
                rb4.setTypeface(null, Typeface.NORMAL);
                rb5.setTypeface(null, Typeface.NORMAL);
                rb6.setTypeface(null, Typeface.NORMAL);
                rb7.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent2 = new Intent(OpcionesmenuActivity.this,
                MenudosActivity.class);
                startActivity(intent2);

                Toast toast2 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Sistemas de Seguridad y Automatización", Toast.LENGTH_LONG);
                toast2.show();
                break;

            case R.id.opcion3:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb3.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1.setTypeface(null, Typeface.NORMAL);
                rb2.setTypeface(null, Typeface.NORMAL);
                rb4.setTypeface(null, Typeface.NORMAL);
                rb5.setTypeface(null, Typeface.NORMAL);
                rb6.setTypeface(null, Typeface.NORMAL);
                rb7.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent3 = new Intent(OpcionesmenuActivity.this, MenutresActivity.class);
                startActivity(intent3);

                Toast toast3 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Redes de Cableado Estructurado y Adecuación de Centros de Computo", Toast.LENGTH_LONG);
                toast3.show();
                break;

           // case R.id.opcion4:
                //if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                   //rb4.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

               // rb1.setTypeface(null, Typeface.NORMAL);
                //rb2.setTypeface(null, Typeface.NORMAL);
                //rb3.setTypeface(null, Typeface.NORMAL);
              //  rb5.setTypeface(null, Typeface.NORMAL);
                //rb6.setTypeface(null, Typeface.NORMAL);
                //rb7.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent4 = new Intent(OpcionesmenuActivity.this,
               // MenucuatroActivity.class);
                //startActivity(intent4);

                //Toast toast4 =
                 //       Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Obra Civil", Toast.LENGTH_LONG);
               // toast4.show();
               // break;


            //case R.id.opcion5:
                //if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                  //  rb5.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //rb1.setTypeface(null, Typeface.NORMAL);
                //rb2.setTypeface(null, Typeface.NORMAL);
                //rb3.setTypeface(null, Typeface.NORMAL);
                //rb4.setTypeface(null, Typeface.NORMAL);
               // rb6.setTypeface(null, Typeface.NORMAL);
                //rb7.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent5 = new Intent(OpcionesmenuActivity.this,
               // MenucincoActivity.class);
               // startActivity(intent5);

                //Toast toast5 =
                        //Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Oil & Gas", Toast.LENGTH_LONG);
               // toast5.show();
                //break;

           // case R.id.opcion6:
               // if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    //rb6.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //rb1.setTypeface(null, Typeface.NORMAL);
                //rb2.setTypeface(null, Typeface.NORMAL);
               // rb3.setTypeface(null, Typeface.NORMAL);
                //rb4.setTypeface(null, Typeface.NORMAL);
               // rb5.setTypeface(null, Typeface.NORMAL);
               // rb7.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                //Intent intent6 = new Intent(OpcionesmenuActivity.this,
                        //MenuseisActivity.class);
              //  startActivity(intent6);

                //Toast toast6 =
                       // Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Servicios de Soporte IT", Toast.LENGTH_LONG);
                //toast6.show();
                //break;

           // case R.id.opcion7:
               // if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    //rb7.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //rb1.setTypeface(null, Typeface.NORMAL);
              //  rb2.setTypeface(null, Typeface.NORMAL);
                //rb3.setTypeface(null, Typeface.NORMAL);
               // rb4.setTypeface(null, Typeface.NORMAL);
               // rb5.setTypeface(null, Typeface.NORMAL);
               // rb6.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent7 = new Intent(OpcionesmenuActivity.this,
               // MenusieteActivity.class);
               // startActivity(intent7);

               // Toast toast7 =
                        //Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Alquiler de Equipos", Toast.LENGTH_LONG);
               // toast7.show();
               // break;




        }
    }
}
