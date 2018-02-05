package com.rjp.imageutils;

import android.app.Activity;
import android.os.Bundle;

import com.rjp.roundimageview.RoundImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoundImageView imageView = (RoundImageView) findViewById(R.id.image1);
        imageView.setImageResource(R.mipmap.image);
    }
}
