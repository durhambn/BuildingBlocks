package edu.cofc.buildingblocks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView header = (TextView) findViewById(R.id.headerText);

        //spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        //spinner drop down elements
        List<String> categories = new ArrayList<>();
        categories.add("Automobile");
        categories.add("Computer");
        categories.add("Education");
        categories.add("Personal");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //on selecting a spinner item
                String item = adapterView.getItemAtPosition(i).toString();

                TextView textView = findViewById(R.id.headerText);
                textView.setText(item);
                //showing selected spinner item
                Toast.makeText(adapterView.getContext(), "seleted: " + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }
}
