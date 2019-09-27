package com.example.sep26;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dynamic_content);

        LinearLayout llview = (LinearLayout) findViewById(R.id.layoutId);
        llview.setBackgroundColor(Color.CYAN);

        //  Inflate the second layout resource file
        LayoutInflater inflater = LayoutInflater.from(this);
        TextView tvView2 = (TextView) inflater.inflate(R.layout.additional_textview, llview, false);
        tvView2.setBackgroundColor(Color.GREEN);
        tvView2.setTextSize(28);
        llview.addView(tvView2);

        TextView tvView = findViewById(R.id.textViewId);
        tvView.setText("Update String");
        tvView.setBackgroundColor(Color.MAGENTA);


    }
}
