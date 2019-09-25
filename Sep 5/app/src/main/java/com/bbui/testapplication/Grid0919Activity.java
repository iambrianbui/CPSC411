package com.bbui.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Grid0919Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout root = new GridLayout(this);

        root.setBackgroundColor(Color.YELLOW);
        root.setOrientation(GridLayout.VERTICAL);




        root.setColumnCount(2);
        root.setRowCount(2);

        TextView tv = new TextView(this);
        tv.setText("String 0");
        tv.setTextSize(32);
        tv.setBackgroundColor(Color.GREEN);

        GridLayout.Spec row_spec = GridLayout.spec(1, 0f);
        GridLayout.Spec col_spec = GridLayout.spec(1, 0f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String 1");
        tv.setTextSize(32);
        tv.setBackgroundColor(Color.GREEN);

        row_spec = GridLayout.spec(0, 0f);
        col_spec = GridLayout.spec(0, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String 3");
        tv.setTextSize(32);
        tv.setBackgroundColor(Color.GREEN);

      //  GridLayout.Spec row_spec = GridLayout.spec(0, 0f);
      //  GridLayout.Spec col_spec = GridLayout.spec(1, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);




        //  createWidgets(root);

        //  createWidgetAtCell("String 0",);

        setContentView(root);;

    }

    private void createWidgetAtCell(GridLayout l, String str, int row, int col){
        TextView tv = new TextView(this);
        tv.setText(str);
        tv.setTextSize(36);
        tv.setBackgroundColor(Color.GREEN);
        GridLayout.Spec rowSpec;
        GridLayout.Spec colSpec;
        if (col == 1 && row == 0){
            rowSpec = GridLayout.spec(row, GridLayout.CENTER, 0f);
            colSpec = GridLayout.spec(col, 1f);
        } else {
            if (col == 0 && row == 0){
                rowSpec = GridLayout.spec(row, 1f);
                colSpec = GridLayout.spec(col, 2, 1f);
            } else {
                rowSpec = GridLayout.spec(row, 1f);
                colSpec = GridLayout.spec(col, 2, 1f);
            }
        }
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);

    }
}
