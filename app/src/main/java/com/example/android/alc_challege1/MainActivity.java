package com.example.android.alc_challege1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button about_Btn, profile_btn;
    private TextView welcome_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intialization();
    }

    private void intialization()
    {
        about_Btn = (Button) findViewById(R.id.btn_about);
        profile_btn = (Button) findViewById(R.id.btn_profile);

        about_Btn.setOnClickListener(this);
        profile_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_about:
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
                break;
            case R.id.btn_profile:
                startActivity(new Intent(MainActivity.this,ProfileActivity.class));
                break;
        }
    }
}
