package com.example.dankdelivery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class StrainInformation1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strain_information1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Strain Information");

        Button button_checkout = (Button)findViewById(R.id.checkout);
        button_checkout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCart();
            }

        });


    }
    public void openCart(){
        Intent intent = new Intent(this,Cart.class);
        startActivity(intent);
    }


}
