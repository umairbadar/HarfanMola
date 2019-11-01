package com.example.harfanmola.Hotel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.harfanmola.LoginActivity;
import com.example.harfanmola.R;
import com.example.harfanmola.WelcomeActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HotelActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
        Animatoo.animateSlideDown(HotelActivity.this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.item_check_in:
                finish();
                startActivity(new Intent(getApplicationContext(), HotelDetailActivity.class));
                Animatoo.animateSlideUp(HotelActivity.this);
                break;
        }
        return true;
    }
}
