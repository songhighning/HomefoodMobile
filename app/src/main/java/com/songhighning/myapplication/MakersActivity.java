package com.songhighning.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Alex on 2016-03-17.
 */
public class MakersActivity extends Activity{
    private static final String TAG = "alexDsMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Makers onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Makers onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Makers onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Makers onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Makers onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "Makers onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "Makers onRestoreInstanceState");
    }
}
