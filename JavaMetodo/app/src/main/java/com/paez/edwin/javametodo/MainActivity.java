package com.paez.edwin.javametodo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("Método Factorial");
        for(int i=0;i<20; i++){
            tv.append("\n "+i+"! = "+factorial(i));

        }
    }

    //Método para calcular el factorial de un número

    double factorial(int n){
        double fac=1;
        if(n==0) return fac;
        for (int i=1;i<=n;i++)
            fac=fac*i;
        return fac;
    }
}
