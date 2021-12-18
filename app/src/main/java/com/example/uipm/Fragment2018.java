package com.example.uipm;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class Fragment2018 extends AppCompatActivity implements AdapterView.OnItemClickListener {


    //Data-Data yang Akan dimasukan Pada ListView
    public String[] mahasiswa = {"181402069","181402030","181402027","181402045","181402048","181402105","181402098","181402117","181402110","181402107"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    public ArrayList<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_2018);
        ListView listView = findViewById(R.id.list);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.gaya_baru, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    public void getData(){
        Collections.addAll(data, mahasiswa);
    }

    public void onItemClick(AdapterView adapterView, View view, int position, long l) {
        String getName = data.get(position);
        Toast.makeText(this, "Mahasiswa Yang Saya Ambil "+getName, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Fragment2018.this, MainActivity2.class);
        intent.putExtra("MyName", getName);
        startActivity(intent);
    }
}