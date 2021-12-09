package com.jsikmc15.googleloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ResultActivity extends AppCompatActivity {

    private TextView tv_id;
    private ImageView iv_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();


        tv_id = findViewById(R.id.tv_result);
        iv_profile = findViewById(R.id.iv_profile);

        tv_id.setText(intent.getStringExtra("nickName"));

        Glide.with(this)
                .load(intent.getStringExtra("photoUri"))
                .into(iv_profile);

    }
}