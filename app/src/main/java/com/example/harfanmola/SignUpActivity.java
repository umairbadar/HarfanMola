package com.example.harfanmola;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import android.widget.Toast;

import com.rilixtech.Country;
import com.rilixtech.CountryCodePicker;

public class SignUpActivity extends AppCompatActivity {

    CountryCodePicker ccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Initializations
        initWidgets();

        /*ccp.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected(Country selectedCountry) {
                Toast.makeText(getApplicationContext(), "Updated " + selectedCountry.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    private void initWidgets(){

        //ccp = findViewById(R.id.ccp);
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
    }
}
