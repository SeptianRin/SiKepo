package com.klepon.kkn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.klepon.kkn.adapters.adapterKuliner;
import com.klepon.kkn.model.modelKuliner;

import java.util.ArrayList;

public class KulinerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterKuliner adapter;
    private ArrayList<modelKuliner> KulinerAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        addData();

        recyclerView =  (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new adapterKuliner(KulinerAL);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        KulinerAL = new ArrayList<>();
        KulinerAL.add(new modelKuliner("1","Kali Pancing", "isinya ikan ikan"));
        KulinerAL.add(new modelKuliner("2","Kios mak Yah", "isinya ciki "));
        KulinerAL.add(new modelKuliner("3","Miayam Bakso", "Miayam bakso legend"));
        KulinerAL.add(new modelKuliner("4","Ngisor Duren", "Durenan"));
        KulinerAL.add(new modelKuliner("5","Lalapan lele pak ku", "Lalapan paling jos"));
        KulinerAL.add(new modelKuliner("6","Kopi Lelet Pak Lemot", "Angkringan modern"));
    }
}
