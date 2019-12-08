package com.smality.travel.traveloboard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class GetData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        Bundle extras = getIntent().getExtras();
        String data=null;
        if (extras != null) {
            data = extras.getString("formdata");
        }

        TextView textView=(TextView) findViewById(R.id.txt);
        textView.setText(data);

    }

}
