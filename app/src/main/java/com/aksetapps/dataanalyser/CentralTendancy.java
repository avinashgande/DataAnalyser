package com.aksetapps.dataanalyser;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CentralTendancy extends AppCompatActivity {
Button btnMean,btnMedian,btnMode,btnGeometricMean,btnHarmonicMean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_tendancy);
        btnMean=(Button)findViewById(R.id.btnMean);
        btnMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mean=new Intent(CentralTendancy.this, com.aksetapps.dataanalyser.Mean.class);
                startActivity(Mean);
            }
        });
        btnMedian=(Button)findViewById(R.id.btnMedian);
        btnMedian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Median=new Intent(CentralTendancy.this, com.aksetapps.dataanalyser.Median.class);
                startActivity(Median);
            }
        });
        btnMode=(Button)findViewById(R.id.btnMode);
        btnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mode=new Intent(CentralTendancy.this, com.aksetapps.dataanalyser.Mode.class);
                startActivity(Mode);
            }
        });
        btnGeometricMean=(Button)findViewById(R.id.btnGeometricMean);
        btnGeometricMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GeometricMean=new Intent(CentralTendancy.this, com.aksetapps.dataanalyser.GeometricMean.class);
                startActivity(GeometricMean);
            }
        });
        btnHarmonicMean=(Button)findViewById(R.id.btnHarmonicMean);
        btnHarmonicMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HarmonicMean=new Intent(CentralTendancy.this, com.aksetapps.dataanalyser.HarmonicMean.class);
                startActivity(HarmonicMean);
            }
        });

            }
}
