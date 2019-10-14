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
        WisataAL.add(new modelWisata("1","Wisata Kali", "Wisatanya sangat bagus"));
        WisataAL.add(new modelWisata("2","Wisata Grojogan", "Dingin Sluur"));
        WisataAL.add(new modelWisata("3","Wisata Hutan Bakau", "Lebat dan bagus"));
        WisataAL.add(new modelWisata("4","Wisata Hutan Jati", "Lebat dan bagus"));
        WisataAL.add(new modelWisata("5","Wisata Hutan Cincau", "Lebat dan bagus"));
        WisataAL.add(new modelWisata("6","Wisata Hutan Bakau", "Lebat dan bagus"));
    }
}
