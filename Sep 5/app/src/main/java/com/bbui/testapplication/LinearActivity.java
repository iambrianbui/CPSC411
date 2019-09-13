package com.bbui.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.graphics.Color;
import android.view.Gravity;

import org.w3c.dom.Text;


public class LinearActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setBackgroundColor(Color.rgb(40, 40, 120));


        LinearLayout llObj = new LinearLayout(this);

        llObj.setBackgroundColor(Color.GREEN);
        llObj.setOrientation(LinearLayout.VERTICAL);

        TextView tv = new TextView(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        lp.setMargins(50, 10, 50, 10);
        lp.gravity = Gravity.CENTER;

        tv.setBackgroundColor(Color.BLUE);
        tv.setText("String 1");
        tv.setLayoutParams(lp);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(36);
        tv.setGravity(Gravity.CENTER);
        lp.weight=1;
        llObj.addView(tv);

        TextView tv1 = new TextView(this);
        tv1.setBackgroundColor(Color.RED);
        tv1.setText("String 2");
        tv1.setLayoutParams(lp);
        tv1.setTextColor(Color.WHITE);
        tv1.setTextSize(36);
        lp.weight=1;
        llObj.addView(tv1);

        TextView tv2 = new TextView(this);
        tv2.setText("String 3");
        tv2.setBackgroundColor(Color.YELLOW);
        tv2.setTextSize(36);
        tv2.setTextColor(Color.WHITE);
        tv2.setLayoutParams(lp);
        lp.weight=3;
        llObj.addView(tv2);

        root.addView(llObj);
        setContentView(root);
    }
}
