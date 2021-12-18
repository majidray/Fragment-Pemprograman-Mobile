package com.example.uipm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity  {
    private TextView GetNIM, GetNama, GetJurusan,GetEmail, GetSemester, GetFakultas,GetStatus;
    private ImageView GetFoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Data Mahasiswa 2018");
        GetNIM = findViewById(R.id.getnim);
        GetNama = findViewById(R.id.getnama);
        GetJurusan = findViewById(R.id.getjurusan);
        GetSemester = findViewById(R.id.getsemester);
        GetEmail = findViewById(R.id.getemail);
        GetFakultas = findViewById(R.id.getfakultas);
        GetStatus = findViewById(R.id.getstatus);
        GetFoto = findViewById(R.id.getfoto);

        showData();

    }
    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){

            case "Mahasiswa - 1":
                GetNIM.setText("181402030");
                GetNama.setText("Fadel Majid Muhammad");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("majidray23@gmail.com.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.imagee);
                break;

            case "Mahasiswa - 2":
                GetNIM.setText("181402069");
                GetNama.setText("Hafizh Rafi Muhammad");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("hafizhrafi28@gmail.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image);

                break;

            case "Mahasiswa - 3":
                GetNIM.setText("181402045");
                GetNama.setText("Arya Ahmad");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("arya12@gmail.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image4);
                break;

            case "Mahasiswa - 4":
                GetNIM.setText("181402027");
                GetNama.setText("Dimas Ridian");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("ridian155@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image3);
                break;

            case "Mahasiswa - 5":
                GetNIM.setText("181402117");
                GetNama.setText("Fikri Fadlillah");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("acel511@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image10);
                break;

            case "Mahasiswa - 6":
                GetNIM.setText("181402048");
                GetNama.setText("Bagoes Prastya");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("bagos555@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image5);
                break;

            case "Mahasiswa - 7":
                GetNIM.setText("181402105");
                GetNama.setText("Dimas Nugraha");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("nugraha121@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image6);
                break;

            case "Mahasiswa - 8":
                GetNIM.setText("181402107");
                GetNama.setText("Habib Ghazali");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("gojali@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image7);
                break;

            case "Mahasiswa - 9":
                GetNIM.setText("181402110");
                GetNama.setText("Muhammad Zaid");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("zeyd@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image8);
                break;

            case "Mahasiswa - 10":
                GetNIM.setText("181402098");
                GetNama.setText("Anggoro Keris");
                GetJurusan.setText("S1 - Teknologi Informasi");
                GetSemester.setText("VII");
                GetEmail.setText("bima@usu.com");
                GetFakultas.setText("Fasilkom - TI");
                GetStatus.setText("Aktif");
                GetFoto.setImageResource(R.drawable.image9);
                break;

        }
    }


}