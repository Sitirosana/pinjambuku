package com.gmail.sitirosana21.pinjambukuapps;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dimas Maulana on 5/26/17.
 * Email : araymaulana66@gmail.com
 */

public class adapterDaftarBuku extends RecyclerView.Adapter<adapterDaftarBuku.BukuViewHolder> {


    private ArrayList<Buku> dataList;

    public adapterDaftarBuku(ArrayList<Buku> dataList) {
        this.dataList = dataList;
    }

    @Override
    public BukuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_buku, parent, false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BukuViewHolder holder, int position) {
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtPengarang.setText(dataList.get(position).getPengarang());
        holder.txtPenerbit.setText(dataList.get(position).getPenerbit());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BukuViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtPengarang, txtPenerbit;

        public BukuViewHolder(View itemView) {
            super(itemView);
            txtJudul = (TextView) itemView.findViewById(R.id.txt_judul);
            txtPengarang = (TextView) itemView.findViewById(R.id.txt_pengarang);
            txtPenerbit = (TextView) itemView.findViewById(R.id.txt_penerbit);
        }
    }
}