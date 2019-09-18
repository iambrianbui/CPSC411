package com.bbui.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollableLinear extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

/*
        HorizontalScrollView sv = new HorizontalScrollView(this);

        LinearLayout lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.VERTICAL);

        for (int i=0; i<=20; i++){
            TextView tv = new TextView(this);
            tv.setText("String " + i);
            tv.setTextSize(32);
            tv.setTextColor(Color.WHITE);
            tv.setBackgroundColor(Color.BLUE);
            lv.addView(tv);
        }

      //  sv.addView(lv);                       idk why this acting up

        setContentView(lv);

        */
        setContentView(R.layout.simple_linear_rf);
    }
}
