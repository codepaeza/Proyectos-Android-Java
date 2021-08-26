package com.paez.edwin.javaclase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("Clase que contiene tres datos numéricos");
        tv.append("\n Se accede a las variables de clase " +
        "mediante el nombre del objeto, seguido de un " +
        "punto y el nombre de la variable");

        //Declaración de objeto Dato

        Dato miDato;

        //Creación del objeto Dato

        miDato=new Dato();

        //Asignación de valores para el objeto Dato

        miDato.i=1;
        miDato.f=1.35f;
        miDato.d=2.3e2;

        tv.append("\n miDato.i= "+miDato.i);
        tv.append("\n miDato.f= "+miDato.f);
        tv.append("\n miDato.d= "+miDato.d);



    }
}

class Dato{
    int i;
    float f;
    double d;
}