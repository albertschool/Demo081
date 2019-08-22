package com.videxedge.demo081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Demo project for Listeners
 *
 * @author      Albert Levy <albert.school2015@gmail.com>
 * @version     1.2 (Include both methods)
 * @since       21/8/2019
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tV;
    Button btnsingle, btndouble;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/**
 * Init parameters
 */
        tV = (TextView) findViewById(R.id.tV);
        btnsingle = (Button) findViewById(R.id.btnsingle);
        btndouble = (Button) findViewById(R.id.btndouble);
        i=0;
/**
 * 1st way: set the Listener & the relevant method in the same line
 */
        btnsingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                tV.setText(""+i);
            }
        });
/**
 * 2nd way, 1st part: set the Listener to the widget
 */
        btndouble.setOnClickListener(this);
    }
/**
 * 2nd way, 2nd part: set the method for the Listener
 */
   @Override
    public void onClick(View view) {
        i+=2;
        tV.setText(""+i);
    }
}
