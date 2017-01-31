package edu.cofc.buildingblocks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkButton = (CheckBox)findViewById(R.id.checkbox);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox) findViewById(R.id.checkbox);
                cb.setText(checkButton.isChecked() ?
                    "This option is checked" :
                    "This option is NOT checked");
            }
        });

    }


}
