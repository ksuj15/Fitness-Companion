package com.example.android.sj.fitnesscompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class List_arms extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_arms);
        TextView t1=(TextView)findViewById(R.id.t1);
        TextView t2=(TextView)findViewById(R.id.t2);
        TextView t3=(TextView)findViewById(R.id.t3);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.t1:
                Intent int1 = new Intent(getApplicationContext(), Biceps_curls.class);
                startActivity(int1);
                break;
            case R.id.t2:
                Intent int2 = new Intent(getApplicationContext(), Concent_curl.class);
                startActivity(int2);
                break;
            case R.id.t3:
                Intent int3 = new Intent(getApplicationContext(), Hammer_curl.class);
                startActivity(int3);
                break;
        }
    }
}

