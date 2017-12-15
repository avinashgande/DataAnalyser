package com.aksetapps.dataanalyser;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Dispersion extends AppCompatActivity {
Button btnRange,btnQD,btnMD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispersion);
        btnRange=(Button)findViewById(R.id.btnRange);
        btnRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Range=new Intent(Dispersion.this, com.aksetapps.dataanalyser.Range.class);
                startActivity(Range);
            }
        });
        btnQD=(Button)findViewById(R.id.btnQD);
        btnQD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent QD=new Intent(Dispersion.this,QuartileDeviation.class);
                startActivity(QD);
            }
        });
        btnMD=(Button)findViewById(R.id.btnMD);
        btnMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MD=new Intent(Dispersion.this,MeanDeviation.class);
                startActivity(MD);
            }
        });

            }
    }


