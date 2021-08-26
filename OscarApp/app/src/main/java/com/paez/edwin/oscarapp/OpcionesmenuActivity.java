package com.paez.edwin.oscarapp;

/**
 * Created by PC on 27/08/2017.
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


                //Starting new intent
                //Intent intent1 = new Intent(OpcionesmenuActivity.this,
                // MenuunoActivity.class);
                //startActivity(intent1);


                Toast toast1 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Me encanta dibujar caricaturas y anime", Toast.LENGTH_LONG);
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

                // Starting new intent
                // Intent intent2 = new Intent(OpcionesmenuActivity.this,
                //MainActivity.class);
                //startActivity(intent22);

                Toast toast2 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Disfruto jugar fútbol con mis amigos", Toast.LENGTH_LONG);
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

                // Starting new intent
                //Intent intent23 = new Intent(CategoriamtActivity.this,
                //FallaraaislemtActivity.class);
                //startActivity(intent23);

                Toast toast3 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Soy hincha del Real Madrid (ESP) y Millonarios (COL)", Toast.LENGTH_LONG);
                toast3.show();
                break;

            case R.id.opcion4:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb4.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1.setTypeface(null, Typeface.NORMAL);
                rb2.setTypeface(null, Typeface.NORMAL);
                rb3.setTypeface(null, Typeface.NORMAL);
                rb5.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent24 = new Intent(CategoriamtActivity.this,
                // FallarasopormtActivity.class);
                //startActivity(intent24);

                Toast toast4 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Practico Agility", Toast.LENGTH_LONG);
                toast4.show();
                break;


            case R.id.opcion5:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb5.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1.setTypeface(null, Typeface.NORMAL);
                rb2.setTypeface(null, Typeface.NORMAL);
                rb3.setTypeface(null, Typeface.NORMAL);
                rb4.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent25 = new Intent(CategoriamtActivity.this,
                //FallaratermimtActivity.class);
                // startActivity(intent25);

                Toast toast5 =
                        Toast.makeText(OpcionesmenuActivity.this, "Has seleccionado: Estoy iniciando a practicar Tennis", Toast.LENGTH_LONG);
                toast5.show();
                break;




        }
    }
}
