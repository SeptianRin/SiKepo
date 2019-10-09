package com.klepon.kkn.adapters;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.klepon.kkn.R;
import com.klepon.kkn.isiwisata.wisata1;
import com.klepon.kkn.isiwisata.wisata2;
import com.klepon.kkn.isiwisata.wisata3;
import com.klepon.kkn.isiwisata.wisata4;
import com.klepon.kkn.isiwisata.wisata5;
import com.klepon.kkn.isiwisata.wisata6;
import com.klepon.kkn.model.modelWisata;

import java.util.ArrayList;

public class adapterWisata extends RecyclerView.Adapter<adapterWisata.WisataViewHolder> {

    private ArrayList<modelWisata> datalist;

    public adapterWisata(ArrayList<modelWisata> datalist) {
        this.datalist = datalist;
    }

    @Override
    public WisataViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_wisata, viewGroup, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WisataViewHolder holder, int position) {
        holder.nomer.setText(datalist.get(position).getNomer());
        holder.namaWisata.setText(datalist.get(position).getNamaWisata());
        holder.tentangWisata.setText(datalist.get(position).getTentangWisata());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }


    public class WisataViewHolder extends RecyclerView.ViewHolder {
        private TextView nomer, namaWisata, tentangWisata;

        public WisataViewHolder(View itemView) {
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
                        intent = new Intent(v.getContext(), wisata1.class);
                    }
                    if (getAdapterPosition() ==1){
                        intent = new Intent(v.getContext(), wisata2.class);
                    }
                    if (getAdapterPosition() ==2){
                        intent = new Intent(v.getContext(), wisata3.class);
                    }
                    if (getAdapterPosition() ==3){
                        intent = new Intent(v.getContext(), wisata4.class);
                    }
                    if (getAdapterPosition() ==4){
                        intent = new Intent(v.getContext(), wisata5.class);
                    }
                    if (getAdapterPosition() ==5){
                        intent = new Intent(v.getContext(), wisata6.class);
                    }

                    v.getContext().startActivity(intent);

                }
            });
        }
    }
}
