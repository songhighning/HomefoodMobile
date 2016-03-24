package com.songhighning.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alex on 2016-03-17.
 */
public class MakersActivity extends Activity{
    private static final String TAG = "alexDsMessage";
    private Button mMainActivityToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makersactivity_main);

        mMainActivityToMain = (Button)findViewById(R.id.MakerActivityToMainActivity);
        mMainActivityToMain.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakersActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
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
