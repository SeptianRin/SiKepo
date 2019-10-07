package com.klepon.kkn.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.klepon.kkn.R;
import com.klepon.kkn.model.modelUMKM;

import java.util.ArrayList;

public class adapterUMKM extends RecyclerView.Adapter<adapterUMKM.UmkmViewHolder> {

    private ArrayList<modelUMKM> datalist;

    public adapterUMKM(ArrayList<modelUMKM> datalist) {
        this.datalist = datalist;
    }

    @Override
    public UmkmViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_wisata, viewGroup, false);
        return new UmkmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UmkmViewHolder holder, int position) {
        holder.nomer.setText(datalist.get(position).getNomer());
        holder.namaWisata.setText(datalist.get(position).getNamaUmkm());
        holder.tentangWisata.setText(datalist.get(position).getTentangUmkm());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }


    public class UmkmViewHolder extends RecyclerView.ViewHolder {
        private TextView nomer, namaWisata, tentangWisata;

        public UmkmViewHolder(View itemView) {
            super(itemView);
            nomer = (TextView) itemView.findViewById(R.id.tv_nomer);
            namaWisata = (TextView) itemView.findViewById(R.id.tv_namaWisata);
            tentangWisata = (TextView) itemView.findViewById(R.id.tv_tentangWisata);
        }
    }
}
