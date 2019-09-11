package com.bbui.testapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        //  1.  Create a TextView object
        TextView v = new TextView(this);

        //  2.  Set attributes
        v.setText("This is a test string.  ");
        v.setBackgroundColor(Color.YELLOW);
        v.setGravity(Gravity.CENTER);
        v.setPadding(50, 50, 50, 256);
        v.setTextSize(36);
        v.setTypeface(null, Typeface.BOLD);
        v.setId(R.id._test_obj_id);

        //  3.  Create parameters
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        v.setLayoutParams(lp);
*/
        setContentView(R.layout.single_widget_layout);
        //  setContentView(v);
        TextView v = findViewById(R.id.textView);
        v.setText("The text string has been updated.");

    }
}
