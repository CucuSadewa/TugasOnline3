package com.example.tugasonline3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox Bandung, Bogor, Banjarmasin, Bontang;
    RadioButton Samarinda, Kendari, Palu, Makasar;
    TextView Nilai1, Nilai2;
    Button Hasil1, Hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bandung = (CheckBox) findViewById(R.id.cb_bandung);
        Bogor = (CheckBox) findViewById(R.id.cb_bogor);
        Banjarmasin = (CheckBox) findViewById(R.id.cb_banjarmasin);
        Bontang = (CheckBox) findViewById(R.id.cb_bontang);
        Nilai1 = (TextView) findViewById(R.id.tv_hasil_nilai1);
        Hasil1 = (Button) findViewById(R.id.btn_periksa_nilai1);

        Samarinda = (RadioButton) findViewById(R.id.rb_samarinda);
        Kendari = (RadioButton) findViewById(R.id.rb_kendari);
        Palu = (RadioButton) findViewById(R.id.rb_palu);
        Makasar = (RadioButton) findViewById(R.id.rb_makasar);
        Nilai2 = (TextView) findViewById(R.id.tv_hasil_nilai2);
        Hasil2 = (Button) findViewById(R.id.btn_periksa_nilai2);
    }

    public void hasil(View view) {
        Integer nilai = 0;
        switch (view.getId()) {
            case R.id.btn_periksa_nilai1:
                if (Bandung.isChecked()) {
                    nilai = nilai + 10;
                }
                if (Banjarmasin.isChecked()) {
                    nilai = nilai + 10;
                }
                if (Bogor.isChecked()) {
                    nilai = nilai - 5;
                }
                if (Bontang.isChecked()) {
                    nilai = nilai - 5;
                }
                Nilai1.setText("Nilai Anda: " + Integer.toString(nilai));
                break;
            case R.id.btn_periksa_nilai2:
                if (Kendari.isChecked()) {
                    Nilai2.setText("Nilai Anda : 10");
                } else {
                    Nilai2.setText("Nilai Anda : -2");
                }
        }

    }
}
