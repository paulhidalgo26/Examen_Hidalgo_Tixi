package com.example.examen_hidalgo_tixi;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityHP_DT extends AppCompatActivity {

    private Button siguiente;


    ActivityResultLauncher<Intent> activityResultLauncher= registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode()==78){
                        Intent intent = result.getData();
                        if (intent !=null){
                           String dato= intent.getStringExtra("resultado");

                        }
                    }

                }
            }
    );




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente=findViewById(R.id.buttonSguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivityHP_DT.this,SegundoActivityHP_DT.class);
                activityResultLauncher.launch((intent));
            }
        });


    }



}