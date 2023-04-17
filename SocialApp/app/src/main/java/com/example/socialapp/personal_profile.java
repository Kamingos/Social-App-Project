package com.example.socialapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavOptions;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

public class Personal_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_profile);
    }

    public void onMyButtonClick(View view) {
        // выводим сообщение
        if (view.getId() == R.id.profile_btn1) {
            Intent intent;
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
        }
        if (view.getId() == R.id.profile_btn2) {
            Intent intent;
            intent = new Intent(this, Add_new_item.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
        }

    }
}