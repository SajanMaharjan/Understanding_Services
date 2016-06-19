package com.example.sajan.understandingservice;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Sajan on 30-May-16.
 */
public class ExampleService extends Service {

    private ArrayList<Integer> someArrList = new ArrayList<>();

    private static final String TAG = ExampleService.class.getSimpleName();


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void simulateLowMemory() {

        for(int i =0; i< 999999999; i++){
            Log.i(TAG+"-","simulateLow Memory");
            someArrList.add(new Integer(i));
        }

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
    //    String passedValue =  intent.getExtras().getString(Constants.PASS_VALUE);
        Log.i(TAG, "onStartCommand");
//        simulateLowMemory();
        return START_NOT_STICKY;

    }

    @Override
    public void onCreate() {

        super.onCreate();
        Log.i(TAG, "onCreate");

    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy();

    }


}
