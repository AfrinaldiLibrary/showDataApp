package com.example.posttest5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputNama = findViewById(R.id.nama);
        EditText inputNim = findViewById(R.id.nim);
        EditText inputFakultas = findViewById(R.id.fakultas);
        EditText inputProdi = findViewById(R.id.prodi);
        EditText inputAlamat = findViewById(R.id.alamat);
        TextView tampilkanData = findViewById(R.id.tampil);
        Button tampilData = findViewById(R.id.button);

        tampilData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = inputNama.getText().toString();
                String nim = inputNim.getText().toString();
                String fakultas = inputFakultas.getText().toString();
                String prodi = inputProdi.getText().toString();
                String alamat = inputAlamat.getText().toString();
                tampilkanData.setVisibility(View.VISIBLE);
                tampilkanData.setText("Nama\t: " + nama + "\nNIM\t: " + nim + "\nFakultas\t: " + fakultas + "\nProdi\t: " + prodi + "\nAlamat\t: " + alamat);

            }
        });
    }
}