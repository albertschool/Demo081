package com.videxedge.demo081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tV;
    Button btnsingle, btndouble;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV = (TextView) findViewById(R.id.tV);
        btnsingle = (Button) findViewById(R.id.btnsingle);
        btndouble = (Button) findViewById(R.id.btndouble);
        i=0;

        btnsingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                tV.setText(""+i);
            }
        });

        btndouble.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        i=i+2;
        tV.setText(""+i);
    }
}
