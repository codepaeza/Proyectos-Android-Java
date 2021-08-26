package com.paez.edwin.javaclasecomplejos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText("\n Clase de números complejos");

        Complejo c1,c2,c3;
        c1=new Complejo(1,1);
        c2=new Complejo(2,3);

        //Partes real e imaginaria usando métodos

        tv.append("\n\n c1="+c1.real()+"+i"+c1.imag());
        tv.append("\n c2="+c2.real()+"+i"+c2.imag());

        //Partes real e imaginaria usando variables de clase

        tv.append("\n\n c1="+c1.a+"+i"+c1.b);
        tv.append("\n modulo de c1 = "+c1.modulo());

        tv.append("\n c2="+c2.a+"+i"+c2.b);
        tv.append("\n modulo de c2) = "+c2.modulo());

    }
}

class Complejo{
    double a,b;

    Complejo(double x,double y){
        a=x;
        b=y;
    }
    double real(){
        return a;
    }
    double imag(){
        return b;
    }
    double modulo(){
        return Math.sqrt(a*a+b*b);
    }
}