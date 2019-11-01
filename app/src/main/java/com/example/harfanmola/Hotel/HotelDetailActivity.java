package com.example.harfanmola.Hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.harfanmola.Hotel.Slider.SliderAdapterExample;
import com.example.harfanmola.LoginActivity;
import com.example.harfanmola.R;
import com.google.android.material.tabs.TabLayout;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class HotelDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageButton btn_like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        SliderView sliderView = findViewById(R.id.imageSlider);
        btn_like = findViewById(R.id.btn_like);

        SliderAdapterExample slideadapter = new SliderAdapterExample(this);

        sliderView.setSliderAdapter(slideadapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new Fragment_Detail(), "Details");
        adapter.AddFragment(new Fragment_Price(), "Prices");
        adapter.AddFragment(new Fragment_Rating(), "Rating");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(getApplicationContext(), HotelActivity.class));
        Animatoo.animateSlideDown(HotelDetailActivity.this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_back:
                 finish();
                 startActivity(new Intent(getApplicationContext(), HotelActivity.class));
                 Animatoo.animateSlideDown(HotelDetailActivity.this);
                 break;

            case R.id.btn_like:
                btn_like.setImageResource(R.drawable.ic_heart_filled);
        }
    }
}
