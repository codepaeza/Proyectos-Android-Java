package com.paez.edwin.turnoapp;

/**
 * Created by PC on 28/12/2017.
 */
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;

public class llamadadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llamada_dos);
    }
    public void llamada21(View v) {
        Intent intent21 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3107878771"));
        startActivity(intent21);
    }
    public void llamada22(View v) {
        Intent intent22 = new Intent("android.intent.action.MAIN");
        intent22.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        intent22.putExtra("jid", PhoneNumberUtils.stripSeparators("57" + "3107878771")+"@s.whatsapp.net");
        startActivity(intent22);
    }
    public void llamada23(View v) {
        Intent intent13 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3157515838"));
        startActivity(intent13);
    }
    public void llamada24(View v) {
        Intent intent24 = new Intent("android.intent.action.MAIN");
        intent24.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        intent24.putExtra("jid", PhoneNumberUtils.stripSeparators("57" + "3157515838")+"@s.whatsapp.net");
        startActivity(intent24);
    }
    public void llamada25(View v) {
        Intent intent15 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3163639837"));
        startActivity(intent15);
    }
    public void llamada26(View v) {
        Intent intent26 = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3185357961"));
        startActivity(intent26);
    }

}
