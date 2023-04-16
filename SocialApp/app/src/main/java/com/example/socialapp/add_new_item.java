package com.example.socialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Add_new_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_item);
    }

    public void onMyButtonClick(View view) {
        // выводим сообщение
        if (view.getId() == R.id.request_btn1) {
            Intent intent;
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        if (view.getId() == R.id.request_btn3) {
            Intent intent;
            intent = new Intent(this, Personal_profile.class);
            startActivity(intent);
        }

    }
}
