package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Life Cycle","onCreate() invoked");

        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Life Cycle","onStart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Life Cycle","onResume() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Life Cycle", "onResume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Life Cycle", "onPush() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Life Cycle", "onStop() invoked");
    }
}