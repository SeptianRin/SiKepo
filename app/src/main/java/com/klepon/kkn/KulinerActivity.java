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
        KulinerAL.add(new modelKuliner("1","Nyopee Semarang", "Tempat nongkrong sambil minum minuman kekinian"));
        KulinerAL.add(new modelKuliner("2","Sendang Putri", "Spesialis pada masakan ayam dan ikan"));
        KulinerAL.add(new modelKuliner("3","Geprek Idoy", "Recomended buat pecinta geprek dari level pedas sedang hingga menantang"));
        KulinerAL.add(new modelKuliner("4","Godrink Thaitea", "Thaitea dengan rasa kekinian dan up-to-date"));
        KulinerAL.add(new modelKuliner("5","Gerobak Seafood Mas Adi", "Sedia berbagai macam seafood"));
    }
}
