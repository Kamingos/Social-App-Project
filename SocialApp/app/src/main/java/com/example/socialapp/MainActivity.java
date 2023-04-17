package com.example.socialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onMyButtonClick(View view) {
        // выводим сообщение

        if (view.getId() == R.id.main_btn2) {
            Intent intent;
            intent = new Intent(this, Add_new_item.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }
        if (view.getId() == R.id.main_btn3) {
            Intent intent;
            intent = new Intent(this, Personal_profile.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }

    }

    private void Buttons() {

    }

}