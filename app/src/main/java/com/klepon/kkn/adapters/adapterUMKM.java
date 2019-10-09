package com.klepon.kkn.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.klepon.kkn.R;
import com.klepon.kkn.isiumkm.umkm1;
import com.klepon.kkn.isiumkm.umkm2;
import com.klepon.kkn.isiumkm.umkm3;
import com.klepon.kkn.isiumkm.umkm4;
import com.klepon.kkn.isiumkm.umkm5;
import com.klepon.kkn.isiumkm.umkm6;
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
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(v.getContext(), "inside viewholder position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                    Intent intent = null;
                    if (getAdapterPosition() ==0){
                        intent = new Intent(v.getContext(), umkm1.class);
                    }
                    if (getAdapterPosition() ==1){
                        intent = new Intent(v.getContext(), umkm2.class);
                    }
                    if (getAdapterPosition() ==2){
                        intent = new Intent(v.getContext(), umkm3.class);
                    }
                    if (getAdapterPosition() ==3){
                        intent = new Intent(v.getContext(), umkm4.class);
                    }
                    if (getAdapterPosition() ==4){
                        intent = new Intent(v.getContext(), umkm5.class);
                    }
                    if (getAdapterPosition() ==5){
                        intent = new Intent(v.getContext(), umkm6.class);
                    }

                    v.getContext().startActivity(intent);

                }
            });
        }
    }
}
