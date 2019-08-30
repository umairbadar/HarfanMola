package com.example.harfanmola;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.TooManyListenersException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_first_name, et_last_name, et_mobile_number, et_email, et_password, et_re_password;

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
        //Edittexts
        et_first_name = findViewById(R.id.et_first_name);
        et_last_name = findViewById(R.id.et_last_name);
        et_mobile_number = findViewById(R.id.et_mobile_number);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_re_password = findViewById(R.id.et_re_password);

    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
    }

    private boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.tv_sign_in:
                finish();
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                break;

            case R.id.btn_register:
                if (TextUtils.isEmpty(et_first_name.getText().toString())){
                    et_first_name.setError("Please enter first name");
                    et_first_name.requestFocus();
                } else if (TextUtils.isEmpty(et_last_name.getText().toString())){
                    et_last_name.setError("Please enter last name");
                    et_last_name.requestFocus();
                } else if (TextUtils.isEmpty(et_mobile_number.getText().toString())){
                    et_mobile_number.setError("Please enter mobile number");
                    et_mobile_number.requestFocus();
                } else if (TextUtils.isEmpty(et_email.getText().toString())){
                    et_email.setError("Please enter email address");
                    et_email.requestFocus();
                } else if (!isEmailValid(et_email.getText().toString())){
                    et_email.setError("Please enter valid email address");
                    et_email.requestFocus();
                } else if (TextUtils.isEmpty(et_password.getText().toString())){
                    et_password.setError("Please enter password");
                    et_password.requestFocus();
                }else if (TextUtils.isEmpty(et_re_password.getText().toString())){
                    et_re_password.setError("Please re-enter password");
                    et_re_password.requestFocus();
                } else if (!et_password.getText().toString().equals(et_re_password.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Password not match",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "DONE",
                            Toast.LENGTH_LONG).show();
                }
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
