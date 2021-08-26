package com.paez.edwin.javametodoprint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("Método void para imprimir");
        for(int i=0;i<20;i++){
            float x=i*i;
            print(x,tv);
        }
    }

    //Método para escribir un número en eun campo de texto

    void print(float x,TextView tv){
        tv.append("\n Método print "+x);
    }

}
