package com.paez.edwin.javacomplejossubclase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText("Ejemplo de una subclase");
        tv.append("\n La clase Complejo2 extiende la clase Complejo "+
                "definiendo métodos para la suma y el producto "+
        "de números complejos");

        Complejo2 c1,c2,c3,c1Inv,c2Inv;
        c1=new Complejo2(1,1);
        c2=new Complejo2(2,3);
        tv.append("\n c1="+c1.real()+" + i"+c1.imag());
        tv.append("\n c2="+c2.real()+" + i"+c2.imag());

        //suma c1+c2
        c3=c1.sum(c2);
        tv.append("\n suma ="+c3.real()+" + i"+c3.imag());

        //producto c1*c2
        c3=c1.prod(c2);
        tv.append("\n producto ="+c3.real()+" + i"+c3.imag());

        //inverso 1/c1
        c1Inv=c1.inv();
        tv.append("\n 1/c1 ="+c1Inv.real()+" + i("+c1Inv.imag()+")");

        //inverso 1/c2
        c2Inv=c2.inv();
        tv.append("\n 1/c2 ="+c2Inv.real()+" + i("+c2Inv.imag()+")");

        //producto c1*1/c1
        c3=c1.prod(c1Inv);
        tv.append("\n c1/c1 ="+c3.real()+" + i"+c3.imag());

        //producto c2*1/c2
        c3=c2.prod(c2Inv);
        tv.append("\n c2/c2 ="+c3.real()+" + i"+c3.imag());

    }
}

class Complejo2 extends Complejo{

        Complejo2(double x, double y){
           super(x,y);
        }
Complejo2 sum(Complejo2 c){
    double cReal=this.real()+c.real();
    double cImag=this.imag()+c.imag();
    Complejo2 result=new Complejo2(cReal,cImag);
    return result;
}
    Complejo2 prod(Complejo2 c){
        double cReal=this.real()*c.real()-this.imag()*c.imag();
        double cImag=this.real()*c.imag()+this.imag()*c.real();
        Complejo2 result=new Complejo2(cReal,cImag);
        return result;
    }
Complejo2 inv(){
    double modulo=this.modulo();
    double cReal=this.real()/(modulo*modulo);
    double cImag=-this.imag()/(modulo*modulo);
    Complejo2 result=new Complejo2(cReal,cImag);
    return result;
}
}

class Complejo{
    double a,b;

    Complejo(double x, double y){
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