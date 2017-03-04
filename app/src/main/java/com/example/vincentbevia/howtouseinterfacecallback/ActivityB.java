package com.example.vincentbevia.howtouseinterfacecallback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity implements
        Contract.CallbackActivityB{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this, "Activity B created", Toast.LENGTH_SHORT).show();
    }

    public void callTheMethod(View view) {
        CallBackClass classB = new CallBackClass(this, this);
        classB.callBackMethodForActivityB();

    }

    @Override
    public void activityInteractions() {
        Toast.makeText(this, "I've been called from ActivityB", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy Activity B", Toast.LENGTH_SHORT).show();
    }
}
