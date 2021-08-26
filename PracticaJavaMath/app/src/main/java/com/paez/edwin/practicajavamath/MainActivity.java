package com.paez.edwin.practicajavamath;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);

        double x,y,z;
        x=Math.PI;
        tv.setText("x = PI = "+x);
        y=-1;
        tv.append("\n y = "+y);
        tv.append("\n Valor Absoluto de y = "+Math.abs(y));
        z=Math.sqrt(x);
        tv.append("\n Raiz cuadrada de x = "+z);
        z=Math.log(x);
        tv.append("\n Logaritmo de x = "+z);
        z=Math.exp(x);
        tv.append("\n Exponencial de x = "+z);
        z=Math.pow(x,3);
        tv.append("\n x al cubo = "+z);
        z=Math.cos(x);
        tv. append("\n coseno de x = "+z);
        z=Math.sin(x);
        tv.append("\n seno de x = "+z);
        z=Math.tan(x);
        tv.append("\n tangente de x = "+z);
        z=Math.acos(y);
        tv.append("\n arcocoseno de y = "+z);
        z=Math.asin(y);
        tv.append("\n arcoseno de y = "+z);
        z=Math.atan(y);
        tv.append("\n arcotangente de y = "+z);
        z=Math.max(x,y);
        tv.append("\n Máximo entre x e y = "+z);
        z=Math.IEEEremainder(x,y);
        tv.append("\n El resto de x entre y es = "+z);
        z=Math.toDegrees(x);
        tv.append("\n x expresado en grados = "+z);
        z=Math.toRadians(y);
        tv.append("\n y expresado en radianes = "+z);


    }
}
