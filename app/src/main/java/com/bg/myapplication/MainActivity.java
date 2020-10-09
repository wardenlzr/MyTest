package com.bg.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import com.bg.myapplication.base.BaseAct;

public class MainActivity extends BaseAct {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showDialog(View view) {
        final AlertDialog dialog = new AlertDialog.Builder(this).setView(R.layout.dialog_group_name).show();
        dialog.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("tv_cancel");
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("tv_confirm");
                dialog.dismiss();
            }
        });
    }
}