package com.bg.myapplication;

import android.app.Application;
import android.os.Process;
import android.util.Log;

/**
 * Created by yubin on 2020/10/12 16:44
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        int pid = Process.myPid();
        Log.e("Warden", "App.onCreate: " + pid);
    }
}
