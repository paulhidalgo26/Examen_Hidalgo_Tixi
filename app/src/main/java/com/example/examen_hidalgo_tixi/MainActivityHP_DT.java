package com.example.examen_hidalgo_tixi;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivityHP_DT extends AppCompatActivity {

    private Button siguiente;
    private TextView valor;
    private ListView lista1;
    private List<String> valores =new ArrayList<String>();

    ActivityResultLauncher<Intent> activityResultLauncher= registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode()==78){
                        Intent intent = result.getData();
                        if (intent !=null){

                          valores= Collections.singletonList(intent.getStringExtra("resultado"));
                           // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, valores);

                        }
                    }

                }
            }
    );




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor=findViewById(R.id.textValor);
        siguiente=findViewById(R.id.buttonSguiente);
        lista1=findViewById(R.id.VectorO);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivityHP_DT.this,SegundoActivityHP_DT.class);
                activityResultLauncher.launch((intent));
            }
        });


    }



}