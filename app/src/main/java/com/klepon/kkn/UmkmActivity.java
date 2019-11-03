package com.klepon.kkn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.klepon.kkn.adapters.adapterUMKM;
import com.klepon.kkn.model.modelUMKM;

import java.util.ArrayList;

public class UmkmActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterUMKM adapter;
    private ArrayList<modelUMKM> UmkmAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umkm);

        addData();

        recyclerView =  (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new adapterUMKM(UmkmAL);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        UmkmAL = new ArrayList<>();
        UmkmAL.add(new modelUMKM("1","NakRantaw", "Madu murni sumbawa"));
        UmkmAL.add(new modelUMKM("2","Yanto Bird Farm", "Peternakan burung lovebird"));
        UmkmAL.add(new modelUMKM("3","Fidyan Futsal", "Tempat futsal yang sangat luas"));
        UmkmAL.add(new modelUMKM("4","TB Rejo Agung", "Toko bangunan lengkap"));
        UmkmAL.add(new modelUMKM("5","Mbak Siti Gamis", "Menjual berbagai macam model gamis"));
        UmkmAL.add(new modelUMKM("6","Dove Cage", "Pembuatan kandang burung dara"));
    }
}
