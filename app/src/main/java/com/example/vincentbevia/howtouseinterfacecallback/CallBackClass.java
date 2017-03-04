package com.example.vincentbevia.howtouseinterfacecallback;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class CallBackClass {

    private Contract.CallbackActivityA contract1;
    private Contract.CallbackActivityB contract2;
    Context context;

    public CallBackClass(Context context, Contract.CallbackActivityA contract1) {
        this.context = context;
        this.contract1 = contract1;
    }

    public CallBackClass(Context context, Contract.CallbackActivityB contract2) {
        this.context = context;
        this.contract2 = contract2;
    }

    public void callBackMethodForActivityA(){
        contract1.talkToMe();
    }


    public void callBackMethodForActivityB(){
        contract2.activityInteractions();
    }

}
