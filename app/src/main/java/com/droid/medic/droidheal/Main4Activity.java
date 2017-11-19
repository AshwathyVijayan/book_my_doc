package com.droid.medic.droidheal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.math.BigInteger;

public class Main4Activity extends AppCompatActivity {
    Integer no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void rn( )
    {
        if (no == 9456) {
            Intent bv = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(bv);
        }
    }

}
