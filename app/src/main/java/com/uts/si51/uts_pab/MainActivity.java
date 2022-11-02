package com.uts.si51.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etNomor;
    TextView tvInformasi;
    CheckBox cbFacebook;
    CheckBox cbInstagram;
    CheckBox cbWebsite;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDaftar = findViewById(R.id.btn_daftar);
        etNama = findViewById(R.id.et_nama);
        etNomor = findViewById(R.id.et_nomorpendaftaran);
        tvInformasi = findViewById(R.id.tv_informasipendaftaran);
        cbFacebook = findViewById(R.id.cb_facebook);
        cbInstagram = findViewById(R.id.cb_Instagram);
        cbWebsite = findViewById(R.id.cb_website);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.cb_facebook:
                        if (cbFacebook.isChecked())
                            Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_Instagram:
                        if(cbInstagram.isChecked())
                            Toast.makeText(getApplicationContext(), "Instagram", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_website:
                        if (cbWebsite.isChecked())
                            Toast.makeText(getApplicationContext(), "Website", Toast.LENGTH_SHORT).show();
                }

                String namaLengkap = etNama.getText().toString();
                String nomorPendaftaran = etNomor.getText().toString();
                String informasiPendaftaran = tvInformasi.getText().toString();

                if (namaLengkap.trim().equals("")){
                    etNama.setError("Nama Di isi Terlebih Dahulu !");
                }

                else if (nomorPendaftaran.trim().equals("")){
                    etNomor.setError("Nomor Di isi Terlebih Dahulu !");
                }

                else if (informasiPendaftaran.trim().equals("Informasi Pendaftaran Dari :")) {
                    tvInformasi.getText().toString();
                }

                else {
                    Intent pindah = new Intent(MainActivity.this, ResultActivity.class);
                    pindah.putExtra("NamaLengkap",namaLengkap);
                    pindah.putExtra("NomorPendaftaran",nomorPendaftaran);
                    startActivity(pindah);
                }
            }
        });
    }
}