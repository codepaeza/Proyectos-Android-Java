package com.paez.edwin.ejemplojavafor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);

        tv.setText("Bucle For en Java");
        double x=10,y=0;
        for(int i=0; i<10; i++) {
            y = Math.sin(i/x);
            tv.append("\n " + i + ", seno(i/x)= " + y);
        }
        tv.append("\n Fin del bucle For, i no está definida");
        tv.append("\n y = "+y);
    }
}
