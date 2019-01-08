package com.gmail.sitirosana21.pinjambukuapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gmail.sitirosana21.pinjambukuapps.Buku;

import java.util.ArrayList;

public class daftarbuku extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterDaftarBuku adapter;
    private ArrayList<Buku> bukuArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarbuku);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new adapterDaftarBuku(bukuArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(daftarbuku.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    public void pinjamClick(View view){
        Intent pinjamintent = new Intent(daftarbuku.this, formpeminjaman.class);
        startActivity(pinjamintent);
    }

    void addData(){
        bukuArrayList = new ArrayList<>();
        bukuArrayList.add(new Buku("Big Data", "Abdul Razik", "Graha pustaka"));
        bukuArrayList.add(new Buku("Paton Running", "Restu Julian", "Dany pustaka"));
        bukuArrayList.add(new Buku("Algoritma dan Pemrograman", "Muhammad Qafy", "Erlangga"));
        bukuArrayList.add(new Buku("Akuntansi dan Keuangan", "Alagus Sobageo", "Tamrin Pustaka"));
    }

}