package com.paez.edwin.javaarrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("Ejemplos de arrays");

        //Definición de un array de longitud 3
        int[] miArray;
        miArray=new int[3];
        //Obtención de la longitud del Array
        int longitud=miArray.length;
        tv.append("\n Valor después = "+longitud);

        //Escribimos los valores iniciales del array (cero)
        for (int i=0;i<3;i++){
            tv.append("\n i="+i+" , miArray[i]="+miArray[i]);
            miArray[i]=1+i*i;
            tv.append("\n Valor después= "+miArray[i]);

        }

        //inicialización de un Array
        double[] miArray2={0,1,2,3};
        tv.append("\n miArray2=");
        for (int i=0;i<miArray2.length;i++){
            tv.append(" "+i+" ");
            double total=suma(miArray2);
            tv.append("\n suma="+total);
        }

       //Suma los elementos de un array
        double suma(double [] a){
       double s=0;
       int nsumandos=a.length;
        for(int i=0;i<nsumandos;i++){
            s=s+a[i];

        }
        return s;
    }


    }
}
