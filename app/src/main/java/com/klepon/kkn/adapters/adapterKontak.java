package com.klepon.kkn.adapters;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.klepon.kkn.KontakActivity;
import com.klepon.kkn.R;
import com.klepon.kkn.model.modelKontak;

import java.util.ArrayList;

public class adapterKontak extends RecyclerView.Adapter<adapterKontak.KontakViewHolder> {

    private ArrayList<modelKontak> datalist;

    public adapterKontak(ArrayList<modelKontak> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public KontakViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_kontak, viewGroup, false);
        return new KontakViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewHolder holder, int position) {
        holder.nomer.setText(datalist.get(position).getNomer());
        holder.namaKontak.setText(datalist.get(position).getNama());
        holder.telp.setText(datalist.get(position).getTelp());
        String number = datalist.get(position).getKewa();
        String path = "Assalamualaikum.wr.wb%20mohon%20maaf"+ datalist.get(position).getNama();
        String url = "https://api.whatsapp.com/send?phone=" + number + "&text=" + path;

    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }


    public class KontakViewHolder extends RecyclerView.ViewHolder {
        private TextView nomer, namaKontak, telp ;
        private ImageButton kewa;

        public KontakViewHolder(View itemView) {
            super(itemView);
            nomer = (TextView) itemView.findViewById(R.id.tv_nomer);
            namaKontak = (TextView) itemView.findViewById(R.id.tv_namaKontak);
            telp = (TextView) itemView.findViewById((R.id.tv_nomorKontak));
            kewa = (ImageButton) itemView.findViewById(R.id.kewa);
        }
    }
}
