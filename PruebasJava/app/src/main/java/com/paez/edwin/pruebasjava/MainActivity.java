package com.paez.edwin.pruebasjava;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setText(
                " Operaciones Aritméticas:\n");

        int i = 1, j;
        double x = 2, y = 3, z;
        //suma
        z = x + y;
        tv.append("\n " + x + " + " + y + " = " + z);
        //resta
        z = x - y;
        tv.append("\n " + x + " - " + y + " = " + z);
        //multiplicación
        z = x * y;
        tv.append("\n " + x + " * " + y + " = " + z);
        //división
        z = x / y;
        tv.append("\n " + x + " / " + y + " = " + z);
        //resto
        z = x % y;
        tv.append("\n\n " + x + " / " + y + " da resto = " + z);
        //incremento
        i++;
        tv.append("\n\n i incrementado en uno = " + i);
        //decremento
        i--;
        tv.append("\n\n i decreemntado en uno = " + i);
        //suma de distintos
        tv.append("\n\n Operaciones con tipos distintos");
        z = x + i;
        j = (int) x + i;
        tv.append("\n" + x + " + " + i + " = " + z);
        tv.append("\n" + x + " + " + i + " = " + j);
        //Operaciones mas complejas
        z = (x * (y + j) / (x * x + 1) - 1 / y) * (i - x) / y;
        //z=z*z;
        tv.append("\n\n Resultado de operacion compuesta z = " + z);
    }
}