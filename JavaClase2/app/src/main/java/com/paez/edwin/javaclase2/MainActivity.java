package com.paez.edwin.javaclase2;

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
        tv.append("\n Se accede a las variables de clase "+
        "mediante el nombe del objeto, seguido de un "+
        "punto y uno de los métodos get()");

        //Declaración de objeto Dato

        Dato miDato;

        //Creación de objeto Dato

        miDato=new Dato(1,1.35f,2.3e2);

        tv.append("\n miDato.getI()= "+miDato.getI());
        tv.append("\n miDato.getF()= "+miDato.getF());
        tv.append("\n miDato.getD()= "+miDato.getD());

        miDato.setI(200);
        miDato.setF(1.23456f);
        miDato.setD(0.1111e-23);

        tv.append("\n \n Después de modifcar las variables con SET:");
        tv.append("\n miDato.getI()= "+miDato.getI());
        tv.append("\n miDato.getF()= "+miDato.getF());
        tv.append("\n miDato.getD()= "+miDato.getD());


    }
}

class Dato{
    private int i;
    private float f;
    private double d;

    //Método constructor de la clase

    Dato(int ivar,float fvar, double dvar){
        i=ivar;
        f=fvar;
        d=dvar;

    }

    //Métodos SET para modificar las variables

    void setI(int ivar){
        i=ivar;
    }
    void setF(float fvar){
        f=fvar;
    }
    void setD(double dvar){
        d=dvar;
    }

    //Métodos GET para extraer las variables

    int getI(){
        return i;
    }
    float getF(){
        return f;
    }
    double getD(){
        return d;
    }
}
