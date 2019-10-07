package com.klepon.kkn;

import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class HomescreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }

    public void Info(View view) {
        AlertDialog.Builder info = new AlertDialog.Builder(HomescreenActivity.this);

        LayoutInflater inflater  = this.getLayoutInflater();
        View informasi = inflater.inflate(R.layout.fragment_info,null);

        info.setView(informasi);
        info.show();
    }


    public void Profil(View view) {
        Intent intent = new Intent(HomescreenActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void Letak(View view) {
        Intent intent = new Intent(HomescreenActivity.this, LetakActivity.class);
        startActivity(intent);
    }

    public void Wisata(View view) {
        Intent intent = new Intent(HomescreenActivity.this, WisataActivity.class);
        startActivity(intent);
    }

    public void Kuliner(View view) {
        Intent intent = new Intent(HomescreenActivity.this, KulinerActivity.class);
        startActivity(intent);
    }

    public void Umkm(View view) {
        Intent intent = new Intent(HomescreenActivity.this, UmkmActivity.class);
        startActivity(intent);
    }

    public void Kontak(View view) {
        Intent intent = new Intent(HomescreenActivity.this, KontakActivity.class);
        startActivity(intent);
    }
}
