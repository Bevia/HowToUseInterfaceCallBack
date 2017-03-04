package com.example.vincentbevia.howtouseinterfacecallback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity implements
        Contract.CallbackActivityA{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Activity A created", Toast.LENGTH_SHORT).show();
    }

    public void goToClassB(View view) {
        CallBackClass classB = new CallBackClass(this, this);
        classB.callBackMethodForActivityA();
    }

    @Override
    public void talkToMe() {
        Toast.makeText(this, "callback method in ActivityA", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Back in Activity A", Toast.LENGTH_SHORT).show();

    }
}
