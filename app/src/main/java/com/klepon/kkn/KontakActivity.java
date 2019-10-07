package com.klepon.kkn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        addData();

        recyclerView =  (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new adapterKontak(KontakAL);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        KontakAL = new ArrayList<>();
        KontakAL.add(new modelKontak("1","Kepala Desa", "08818181818181","628818181818181"));
        KontakAL.add(new modelKontak("2","Sekretaris Desa", "08818181818181","628818181818181"));
        KontakAL.add(new modelKontak("3","Ketua PKK", "08818181818181","628818181818181"));
        KontakAL.add(new modelKontak("4","Pak Rustam", "08818181818181","628818181818181"));
        KontakAL.add(new modelKontak("5","Pak Darmono", "08818181818181","628818181818181"));
        KontakAL.add(new modelKontak("6","Bu Yani", "08818181818181","628818181818181"));

    }


}
