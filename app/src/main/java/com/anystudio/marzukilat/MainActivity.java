package com.anystudio.marzukilat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button dukung;
private TextView tampil;
private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dukung=(Button)findViewById(R.id.dukung);
        tampil=(TextView)findViewById(R.id.tampil);

        dukung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    counter=counter+1;
                    tampil.setText(counter+"");

            }

        });




    }
}
