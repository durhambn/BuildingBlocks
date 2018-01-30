package edu.cofc.buildingblocks;

import android.annotation.SuppressLint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        textView = (TextView) findViewById(R.id.textview);


        button.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");
                        v.performClick();
                        textView.setText(R.string.pressDown);
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");
                        textView.setText(R.string.buttonReleased);

                        break;
                }

                return true;
            }


        });

    }
}
