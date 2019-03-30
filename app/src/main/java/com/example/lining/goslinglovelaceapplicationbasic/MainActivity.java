package com.example.lining.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if(isScrennLand()){
//            Log.d("MainActivity", "竖屏");
//            setContentView(R.layout.activity_main);
//        }
//        else {
//            Log.d("MainActivity", "横屏");
//            setContentView(R.layout.activity_main);
//        }
    }

    private boolean isScrennLand() {
        // 竖屏
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            return true;
        }
        else {
        return false;}
    }
}
