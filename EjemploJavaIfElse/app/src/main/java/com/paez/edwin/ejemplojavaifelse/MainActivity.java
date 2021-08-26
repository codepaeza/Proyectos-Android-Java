package com.paez.edwin.ejemplojavaifelse;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView1);
        tv.setText("Bloque if-else \n");

        double x=2,y=3;
        if(x==y) {
            tv.append("\n "+x+" = "+y);
        }
        else if (x>y) {
            tv.append("\n " + x + " > " + y);
        }
            else{
                tv.append("\n " + x + " < " + y);
            }

        tv.append("\n\n\n Operadores Boolenanos");
        boolean condicion1=x>1;
        boolean condicion2=y<5;
        tv.append("\n condicion1 es = "+condicion1);
        tv.append("\n condicion2 es = "+condicion2);
        if(condicion1 & condicion2) {
            tv.append("\n Las dos son true simultaneamente: "+"\n"+x+" > 1 y "+y+" <10");
        } else{
            tv.append("\n Una de las dos es falsa");
        }
        }
    }

