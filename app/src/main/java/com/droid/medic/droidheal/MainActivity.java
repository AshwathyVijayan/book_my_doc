package com.droid.medic.droidheal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent a = new Intent (MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(a);
                MainActivity.this.finish();
            }
        }, 1700);
    }

    }
