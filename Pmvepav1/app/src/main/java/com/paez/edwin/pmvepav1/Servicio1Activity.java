package com.paez.edwin.pmvepav1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by PC on 27/08/2017.
 */

public class Servicio1Activity extends ActionBarActivity{
    public AdaptadorLugares adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_servicio1);
        adaptador= new AdaptadorLugares(this);
        Listview listview=(ListView) findViewById(R.id.listview1);
        listview.setAdapter(adaptador);

    }
}
