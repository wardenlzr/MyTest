package com.bg.mytest.act;

import android.os.Bundle;
import android.util.Log;

import com.bg.mytest.R;
import com.bg.mytest.base.BaseAct;

public class AAct extends BaseAct {

    public static void start(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, AAct.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        loge();
    }

    @Override
    protected void onStart() {
        super.onStart();
        loge();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        loge();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loge();
    }

    @Override
    protected void onPause() {
        super.onPause();
        loge();
    }

    @Override
    protected void onStop() {
        super.onStop();
        loge();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loge();
    }
}