package com.bg.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AlertDialog dialog = new AlertDialog.Builder(this).setView(R.layout.dialog_group_name).show();
        dialog.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tv_cancel", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tv_confirm", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

    }

    public void jump(View view) {
        Activity activity = new Activity();
        log(activity.getPackageName());
//        activity.onCreate(bundle);
    }

    public void log(String s) {
        Log.e("Warden", "log() called with: s = [" + s + "]");
    }


}