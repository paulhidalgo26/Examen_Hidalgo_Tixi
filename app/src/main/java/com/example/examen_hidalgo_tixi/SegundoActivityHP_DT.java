package com.example.examen_hidalgo_tixi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SegundoActivityHP_DT extends AppCompatActivity {
    private EditText edt;
    private ListView lista;
    private Button cerar;
    private List<String> numeros= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_hp_dt);
        edt=findViewById(R.id.Tx_insertar);
        cerar=findViewById(R.id.buttonCerrar);
        lista= findViewById(R.id.Valores);

    }

    public void CerrarHP_DT(View view) {
        Intent intent = new Intent();
        intent.putExtra("resultado",numeros.toString());
        setResult(78, intent );
        finish();

        SegundoActivityHP_DT.super.onBackPressed();
    }



    public void InsertarHP_DT(View view) {
       numeros.add(edt.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numeros);
        lista.setAdapter(adapter);
        edt.setText("");
    }

}