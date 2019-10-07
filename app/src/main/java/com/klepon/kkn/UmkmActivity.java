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
        UmkmAL.add(new modelUMKM("1","aSDH", "Wisatanya sangat bagus"));
        UmkmAL.add(new modelUMKM("2","asdas", "Dingin Sluur"));
        UmkmAL.add(new modelUMKM("3","asdacxz", "Lebat dan bagus"));
        UmkmAL.add(new modelUMKM("4","Dcdscsdc", "Lebat dan bagus"));
        UmkmAL.add(new modelUMKM("5","Wisata Hutan Cincau", "Lebat dan bagus"));
        UmkmAL.add(new modelUMKM("6","Wisata Hutan Bakau", "Lebat dan bagus"));
    }
}
