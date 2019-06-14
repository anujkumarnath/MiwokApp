package com.androiddreams.miwokapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        findViewById(R.id.numbers).setOnClickListener(this);
        findViewById(R.id.colors).setOnClickListener(this);
        findViewById(R.id.phrases).setOnClickListener(this);
        findViewById(R.id.family).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Context context = MainActivity.this;
        switch (view.getId()) {
            case R.id.numbers:
                startActivity(new Intent(context, NumbersActivity.class));
                break;
            case R.id.colors:
                startActivity(new Intent(context, ColorsActivity.class));
                break;
            case R.id.family:
                startActivity(new Intent(context, FamilyActivity.class));
                break;
            case R.id.phrases:
                startActivity(new Intent(context, PhraseActivity.class));
                break;
        }

    }
}
