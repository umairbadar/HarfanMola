package com.example.harfanmola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.btn_sign_up:
                finish();
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
                Animatoo.animateSlideUp(WelcomeActivity.this);
                break;

            case R.id.tv_sign_in:
                finish();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                Animatoo.animateSlideUp(WelcomeActivity.this);
                break;
        }
    }
}
