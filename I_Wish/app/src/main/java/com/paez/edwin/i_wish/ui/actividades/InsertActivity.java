package com.paez.edwin.i_wish.ui.actividades;

/**
 * Created by PC on 11/01/2018.
 */

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.paez.edwin.i_wish.R;
import com.paez.edwin.i_wish.ui.fragmentos.ConfirmDialogFragment;
import com.paez.edwin.i_wish.ui.fragmentos.DatePickerFragment;
import com.paez.edwin.i_wish.ui.fragmentos.InsertFragment;

public class InsertActivity extends AppCompatActivity
        implements DatePickerFragment.OnDateSelectedListener,
        ConfirmDialogFragment.ConfirmDialogListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null)
            getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_done);

        // Creación del fragmento de inserción
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new InsertFragment(), "InsertFragment")
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return true;
    }

    @Override
    public void onDateSelected(int year, int month, int day) {
        InsertFragment insertFragment = (InsertFragment)
                getSupportFragmentManager().findFragmentByTag("InsertFragment");

        if (insertFragment != null) {
            insertFragment.actualizarFecha(year, month, day);
        }
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        InsertFragment insertFragment = (InsertFragment)
                getSupportFragmentManager().findFragmentByTag("InsertFragment");

        if (insertFragment != null) {
            finish(); // Finalizar actividad descartando cambios
        }
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        InsertFragment insertFragment = (InsertFragment)
                getSupportFragmentManager().findFragmentByTag("InsertFragment");

        if (insertFragment != null) {
            // Nada por el momento
        }
    }
}
