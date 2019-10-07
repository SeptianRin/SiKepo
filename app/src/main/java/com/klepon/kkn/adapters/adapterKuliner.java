package com.klepon.kkn.adapters;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.klepon.kkn.R;
import com.klepon.kkn.model.modelKuliner;

import java.util.ArrayList;

public class adapterKuliner extends RecyclerView.Adapter<adapterKuliner.KulinerViewHolder>{

    private ArrayList<modelKuliner> datalist;

    public adapterKuliner(ArrayList<modelKuliner> datalist) {
        this.datalist = datalist;
    }

    @Override
    public KulinerViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_wisata, viewGroup, false);
        return new KulinerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KulinerViewHolder holder, int position) {
        holder.nomer.setText(datalist.get(position).getNomer());
        holder.namaWisata.setText(datalist.get(position).getNamaKuliner());
        holder.tentangWisata.setText(datalist.get(position).getTentangKuliner());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }


    public class KulinerViewHolder extends RecyclerView.ViewHolder {
        private TextView nomer, namaWisata, tentangWisata;

        public KulinerViewHolder(View itemView) {
            super(itemView);
            nomer = (TextView) itemView.findViewById(R.id.tv_nomer);
            namaWisata = (TextView) itemView.findViewById(R.id.tv_namaWisata);
            tentangWisata = (TextView) itemView.findViewById(R.id.tv_tentangWisata);
        }
    }
}
