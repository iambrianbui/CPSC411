package com.bbui.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Relative0924Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout root = new RelativeLayout(this);
        root.setBackgroundColor(Color.YELLOW);

        TextView tv = new TextView(this);
        tv.setText("String 0");
        tv.setTextSize(24);
        tv.setId(R.id.test_view_id);
        tv.setBackgroundColor(Color.GREEN);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tv.setLayoutParams(params);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String 1");
        tv.setTextSize(24);
        tv.setBackgroundColor(Color.CYAN);
        params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        //params.addRule(RelativeLayout.BELOW, R.id.test_view_id);
        //params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params.addRule(RelativeLayout.LEFT_OF, R.id.test_view_id);
        params.addRule(RelativeLayout.ALIGN_BASELINE, R.id.test_view_id);
        tv.setLayoutParams(params);
        root.addView(tv);
        setContentView(root);
    }
}
