package com.example.sajan.understandingservice;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Sajan on 30-May-16.
 */
public class ExampleIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    private static String TAG = ExampleService.class.getSimpleName();

    public ExampleIntentService() {
        super("ExampleIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        for(int i=0;i<10;i++){
            Log.i(TAG,"onHandleIntent : "+i);
            sleep(2000);
        }
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onCreate() {
        Log.i(TAG+"-","onCreate");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG+"-","onDestroy");
        super.onDestroy();
    }
}
