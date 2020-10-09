package com.bg.myapplication.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.bg.myapplication.MainActivity;

public class BaseAct extends Activity {

    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
    }

    public void loge(String s) {
        Log.e("Warden", "log() called with: s = [" + s + "]");
    }

    public void toast(String s) {
        try {
            Toast.makeText(activity, s, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}