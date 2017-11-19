package com.droid.medic.droidheal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.fadein,R.anim.fadeout);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void op1(View v)
    {
        Intent a = new Intent (Main2Activity.this,Main3Activity.class);
        startActivity(a);
    }
    public void op2(View v1)
    {
        Intent c = new Intent (Main2Activity.this,LoginActivity.class);
        startActivity(c);
    }
}
