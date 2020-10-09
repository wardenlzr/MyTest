package com.bg.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bg.myapplication.base.BaseAct;

public class AActivity extends BaseAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("OneActivity", "onCreate");
    }

    public void say(){
        toast("say");
    }
}