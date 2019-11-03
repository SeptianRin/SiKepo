package com.klepon.kkn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.klepon.kkn.adapters.adapterWisata;
import com.klepon.kkn.model.modelWisata;

import java.util.ArrayList;

public class WisataActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterWisata adapter;
    private ArrayList<modelWisata> WisataAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        addData();

        recyclerView =  (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new adapterWisata(WisataAL);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

//    private void runAnimationAgain(){
//        final LayoutAnimationController controller =
//                AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_down_to_up);

//        recyclerView.setLayoutAnimation(controller);
//        recyclerView.getAdapter().notifyDataSetChanged();
//        recyclerView.scheduleLayoutAnimation();
//    }

    void addData(){
        WisataAL = new ArrayList<>();
        WisataAL.add(new modelWisata("1","D'Pongs", "Tempat berwisata bersama keluarga besar"));
        WisataAL.add(new modelWisata("2","Keboen Ndalem", "Cocok untuk Anda yang sedang mencari suasana pedesaan ditengah perkotaan"));
        WisataAL.add(new modelWisata("3","Citra Argo", "Wisata Alam dengan pesona buah 5 benua yang ada didalamnya"));
        WisataAL.add(new modelWisata("4","Kampung Bonsai", "Kampung tematik kelurahan Pongangan yang penduduknya banyak sebagai pengrajin bonsai"));
    }
}
