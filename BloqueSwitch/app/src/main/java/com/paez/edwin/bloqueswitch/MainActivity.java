package com.paez.edwin.bloqueswitch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Bloque switch");

        for (int i = 0; i < 20; i++) {
            switch (i) {
                case 5: {
                    tv.append("\n pasa por 5");
                    break;
                }
                case 10: {
                    tv.append("\n también pasa por 10");
                    break;
                }
                case 15: {
                    tv.append("\n toma el valor de 15");
                    break;
                }
                default:
                    tv.append("\n i= " + i);
            }
            //Fin del bloque switch
        }
        //Fin del bloque for
    }
}
