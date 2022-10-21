package com.example.kalkulator;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranFragment extends Fragment {
    private EditText jari;
    private Button btnHasil;
    private TextView luas,keliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);
        jari = v.findViewById(R.id.jari);
        btnHasil = v.findViewById(R.id.btnHasil);
        luas = v.findViewById(R.id.luas);
        keliling = v.findViewById(R.id.keliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                String nilai1 = jari.getText().toString();

                if(nilai1.isEmpty()) {
                    jari.setError("Data tidak boleh kosong");
                    jari.requestFocus();
                }
                else{
                    Double jari = Double.parseDouble(nilai1);

                    Double l = 3.14 * Math.pow(jari,2);
                    Double k = 2 * 3.14 * jari;
                    luas.setText(String.format("%.2f",l));
                    keliling.setText(String.format("%.2f",k));

                }
            }
        });


        return v;
    }
}