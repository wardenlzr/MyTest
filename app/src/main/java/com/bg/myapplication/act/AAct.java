package com.bg.myapplication.act;

import android.os.Bundle;
import android.util.Log;

import com.bg.myapplication.R;
import com.bg.myapplication.base.BaseAct;

public class AAct extends BaseAct {

    public static void start(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, AAct.class);
        Log.e("Warden", "start " + android.os.Process.myPid());
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        loge("AAct.onCreate");
        Log.e("Warden", "AAct.onCreate " + android.os.Process.myPid());
        toast("AAct.onCreate" + android.os.Process.myPid());

    }


}