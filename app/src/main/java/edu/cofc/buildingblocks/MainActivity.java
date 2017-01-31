package edu.cofc.buildingblocks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text_filtered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_filtered = (EditText) findViewById(R.id.input_filtered);
        text_filtered.setFilters(new InputFilter[] {
                new InputFilter.AllCaps(),

        });


    }


}
