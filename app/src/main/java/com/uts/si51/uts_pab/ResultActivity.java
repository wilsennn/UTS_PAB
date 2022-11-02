package com.uts.si51.uts_pab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity{
    TextView tvNamaLengkap;
    TextView tvNomorPendaftaran;
    TextView tvInformasiPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNamaLengkap = findViewById(R.id.tv_tampil_nama);
        tvNomorPendaftaran = findViewById(R.id.tv_tampil_nomor);
        tvInformasiPendaftaran = findViewById(R.id.tv_tampil_info);

        Intent terima = getIntent();
        String yNamaLengkap = terima.getStringExtra("namalengkap");
        String yNomorPendaftaran = terima.getStringExtra("NomorPendaftaran");
        String yInformasiPendaftaran = terima.getStringExtra("informasiPendaftaran");
        tvNamaLengkap.setText(yNamaLengkap);
        tvNomorPendaftaran.setText(yNomorPendaftaran);
        tvInformasiPendaftaran.setText(yInformasiPendaftaran);

    }
}