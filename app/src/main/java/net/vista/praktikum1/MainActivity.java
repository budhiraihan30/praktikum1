package net.vista.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     private void showLog(String text) { 
         log.d(getPackageName(), text);
     }

    @Override
    protected void onRestart() {
        super.onRestart(); //call to restart after onStop
        showLog("Activity restarted");
    }

    @Override
    protected void onStart() {
        super.onStart(); //soon be visible
        showLog("Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume(); //visible
        showLog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause(); //invisible
        showLog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity is being destroyed");
    }

}