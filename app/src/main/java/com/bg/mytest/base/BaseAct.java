package com.bg.mytest.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.bg.mytest.MainActivity;
import com.socks.library.KLog;

public class BaseAct extends Activity {

    protected Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
    }

    public void loge() {
        KLog.e();
    }

    public void loge(String s) {
        KLog.e(s);
    }

    public void toast(String s) {
        try {
            Toast.makeText(activity, s, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}