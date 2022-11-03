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

                String nama, nomor;
                String facebook, instagram, website;

                nama = etNama.getText().toString();
                nomor = etNomor.getText().toString();
                facebook = cbFacebook.getText().toString();
                instagram = cbInstagram.getText().toString();
                website = cbWebsite.getText().toString();

                if (nama.trim().equals("")) {
                    etNama.setError("Nama Tidak Boleh Kosong !");

                } else if (nomor.trim().equals("")) {
                    etNomor.setError("Nomor Pendaftaran Tidak Boleh Kosong !");

                } else if (!cbFacebook.isChecked() && !cbInstagram.isChecked() && !cbWebsite.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak ada sosial media yang dipilih !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNomor", nomor);
                    intent.putExtra("varFb", facebook);
                    intent.putExtra("varIg", instagram);
                    intent.putExtra("varWeb", website);
                    startActivity(intent);
                }

            }
        });

    }
}