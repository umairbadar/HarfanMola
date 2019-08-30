package com.example.harfanmola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_sign_up;
    private TextView tv_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Initialization Widgets
        initWidgets();
    }

    private void initWidgets(){

        btn_sign_up = findViewById(R.id.btn_sign_up);
        tv_sign_in = findViewById(R.id.tv_sign_in);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.btn_sign_up:
                finish();
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
                break;

            case R.id.tv_sign_in:
                finish();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;
        }
    }
}
