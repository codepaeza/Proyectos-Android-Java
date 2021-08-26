package com.paez.edwin.ejemplowhilecontinue;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);

        tv.setText("Bucle while para control");
        int i=0;
        while(true){
            i++;
            //salta al principio del bucle
            if(i==5) continue;
            //finaliza el bucle
            if(i==10) break;
            double y=Math.sqrt(i);
            tv.append("\n "+i+", raiz()= "+y);
        }
        tv.append("\n Fin del Bucle, i = "+i);
    }
}
