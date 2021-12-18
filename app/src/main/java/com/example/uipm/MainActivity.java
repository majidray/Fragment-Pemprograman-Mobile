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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    //Data-Data yang Akan dimasukan Pada ListView
    public String[] mahasiswa = {"Mahasiswa - 1","Mahasiswa - 2","Mahasiswa - 3","Mahasiswa - 4","Mahasiswa - 5","Mahasiswa - 6","Mahasiswa - 7", "Mahasiswa - 8","Mahasiswa - 9","Mahasiswa - 10"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    public ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
        Toast.makeText(this, "Menampilkan Data "+getName, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("MyName", getName);
        startActivity(intent);
    }
}