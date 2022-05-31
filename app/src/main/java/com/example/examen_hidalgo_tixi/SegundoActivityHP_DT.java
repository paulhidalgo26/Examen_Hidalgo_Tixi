package com.example.examen_hidalgo_tixi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SegundoActivityHP_DT extends AppCompatActivity {
private EditText edt;
private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_hp_dt);
    edt= findViewById(R.id.valorIngresado);
    lista= findViewById(R.id.listviewValores);

    }

    public void CerrarHP_DT(View view){
        Intent intent = new Intent(this,MainActivityHP_DT.class);
        startActivity(intent);
    }
    public  void Ingresar(View view){


    }
}