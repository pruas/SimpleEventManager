package com.seek.simpleeventmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void back(View v){
        finish();
    }

    public void send(View v){
        EventManager.getDefualt().post("hello , i'm activity2!");
        Toast.makeText(Main2Activity.this, "send success", Toast.LENGTH_SHORT).show();
    }
}
