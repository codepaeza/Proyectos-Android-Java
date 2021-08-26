package com.paez.edwin.ejemplojavawhile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);

        tv.setText("Bucle While Java");
        int i=0;
        while(i<10){
            //variable no definida fuera del bucle
            double y=Math.random();
            tv.append("\n "+i+", random()= "+y);
            i++;
        }
        tv.append("\n Fin del bucle for, i = "+i);
    }
}
