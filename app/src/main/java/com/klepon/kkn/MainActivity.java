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

        addFragment(new Step.Builder().setTitle("Ketahui Kelurahan Pongangan")
                .setContent("Dengan aplikasi SIKEPO Anda akan mendapatkan perkenalan dari kelurahan Pongangan")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.roadsign) // int top drawable
                .build());
        addFragment(new Step.Builder().setTitle("Temukan Kuliner Yang Direkomendasikan")
                .setContent("Ganjal perut Anda dengan makanan makanan yang ada di kelurahan Pongangan")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.eattogether) // int top drawable
                .build());
        addFragment(new Step.Builder().setTitle("Dapatkan Lokasi Wisata dan UMKM Rekomendasi")
                .setContent("Temukan banyak HIDDEN TREASURE yang ada di kelurahan Pongangan dengan aplikasi SIKEPO")
                .setBackgroundColor(Color.parseColor("#8BC34A")) // int background color
                .setDrawable(R.drawable.traveling) // int top drawable
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