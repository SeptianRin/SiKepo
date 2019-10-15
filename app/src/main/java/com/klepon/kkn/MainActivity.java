package com.klepon.kkn;

import android.Manifest;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.PermissionStep;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class MainActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.roadsign) // int top drawable
                .setSummary("This is summary")
                .build());
        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.eattogether) // int top drawable
                .setSummary("This is summary")
                .build());
        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.traveling) // int top drawable
                .setSummary("This is summary")
                .build());
        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.basketba) // int top drawable
                .setSummary("This is summary")
                .build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void finishTutorial() {
        Intent intent = new Intent(MainActivity.this, HomescreenActivity.class);
        startActivity(intent);
    }
}