package com.example.harfanmola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.harfanmola.Hotel.HotelActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Initializations
        initWidgets();
    }

    private void initWidgets(){
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
    }

    private boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
        Animatoo.animateSlideDown(LoginActivity.this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_login:
                /*if (TextUtils.isEmpty(et_email.getText().toString())){
                    et_email.setError("Please enter email address");
                    et_email.requestFocus();
                } else if (!isEmailValid(et_email.getText().toString())){
                    et_email.setError("Please enter valid email address");
                    et_email.requestFocus();
                }  else if (TextUtils.isEmpty(et_password.getText().toString())){
                    et_password.setError("Please enter email password");
                    et_password.requestFocus();
                } else {
                    Toast.makeText(getApplicationContext(), "DONE",
                            Toast.LENGTH_LONG).show();
                }*/
                finish();
                startActivity(new Intent(getApplicationContext(), HotelActivity.class));
                Animatoo.animateSlideUp(LoginActivity.this);
                break;

            case R.id.tv_forgot_password:
                Toast.makeText(getApplicationContext(),"Forgot Password",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.fab_facebook:
                Toast.makeText(getApplicationContext(),"Facebook",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.fab_twitter:
                Toast.makeText(getApplicationContext(),"Twitter",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.fab_googlePlus:
                Toast.makeText(getApplicationContext(),"Google Plus",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
