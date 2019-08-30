package com.example.harfanmola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_login:
                //finish();
                //startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }
}
