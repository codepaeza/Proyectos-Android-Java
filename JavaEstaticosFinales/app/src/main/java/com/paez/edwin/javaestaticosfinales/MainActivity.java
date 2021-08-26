package com.paez.edwin.javaestaticosfinales;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("Variables y métodos final y/o estáticos");

        tv.append("\n static aa="+Abc.aa);
        tv.append("\n static final BB="+Abc.BB);
        tv.append("\n static final CC="+Abc.CC);
       // double x=1.5;
        //tv.append("\n Función static f(x)="+Abc.f(x));

        for (int i=1;i<10;i++){
            Abc v1=new Abc();
            v1.write(tv);
        }
        tv.append("\n Fuera del bucle:");
        Abc v2=new Abc();
        v2.write(tv);
        Abc v3=v2;
        v3.write(tv);

    }
}

class Abc{
    static int aa=0;
    static final int BB=555;
    static final int CC=777;

    Abc(){
        aa++;
    }
    void write(TextView tv){
        tv.append("\n Variable estática aa="+aa);
    }
   // static double f(double x){
              // return BB+CC*x;
    //}
}