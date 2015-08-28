package com.example.dunja.petak28;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2, editText3, editText5;
    Button btn, btsat, btuk;
    double x = 0, y = 500, z = 0, s = 0, t = 0, m = 0, n = 0;
    TextView rezultat, ukupno, izracunate,prva;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }


    private void initControls() {

        btn = (Button) findViewById(R.id.button);
        btsat = (Button) findViewById(R.id.button3);
        btuk = (Button) findViewById(R.id.button2);

        rezultat = (TextView) findViewById(R.id.textView);
        ukupno = (TextView) findViewById(R.id.textView7);
        izracunate = (TextView) findViewById(R.id.textView6);
        prva= (TextView) findViewById(R.id.textView8);


        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);


        btn.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                calculate();
            }
        });


        btsat.setOnClickListener(new Button.OnClickListener()

                                 {
                                     public void onClick(View v) {
                                         sateracunaj();
                                     }
                                 }

        );

        btuk.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                ukupno1();
            }
        });


    }


    public void calculate() {
        x = Double.parseDouble(editText.getText().toString());
        y = 500;
        z = x * y;
        prva.setText(Double.toString(z));
    }


    public void sateracunaj() {

        s = Double.parseDouble(editText2.getText().toString());

        t = Double.parseDouble(editText3.getText().toString());

        m = ((z / s) / 8) * 1.26 * t;


        izracunate.setText(Double.toString(m));

    }

    public void ukupno1() {
        n = z + m;

        ukupno.setText(Double.toString(n));
    }
}