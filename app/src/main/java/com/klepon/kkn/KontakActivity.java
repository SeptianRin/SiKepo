package com.klepon.kkn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.klepon.kkn.adapters.adapterKontak;
import com.klepon.kkn.adapters.adapterKuliner;
import com.klepon.kkn.model.modelKontak;

import java.util.ArrayList;

public class KontakActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterKontak adapter;
    private ArrayList<modelKontak> KontakAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
    }



    public void Telefon(View view) {
        Toast.makeText(this, "Mengarah ke aplikasi Telepon", Toast.LENGTH_SHORT).show();
    }

    public void Instagram(View view) {
        Toast.makeText(this, "Mengarah Ke Instagtam", Toast.LENGTH_SHORT).show();
    }

    public void Email(View view) {
        Toast.makeText(this, "Mengarah Ke Email", Toast.LENGTH_SHORT).show();
    }
}
