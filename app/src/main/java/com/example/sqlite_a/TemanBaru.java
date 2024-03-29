package com.example.sqlite_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sqlite_a.database.DBcontroler;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class TemanBaru extends AppCompatActivity {
    private TextInputEditText tNama, tTelepon;
    private Button simpanBtn;
    String nm,tlp;
    DBcontroler controller = new DBcontroler(this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman_baru);

        tNama = (TextInputEditText) findViewById(R.id.tietNama);
        tTelepon = (TextInputEditText) findViewById(R.id.tietTelepon);
        simpanBtn = (Button) findViewById(R.id.buttonSave);

        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tNama.getText().toString().equals("") || tTelepon.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Data Kosong!",Toast.LENGTH_SHORT).show();

                }else {
                    nm = tNama.getText().toString();
                    tlp = tTelepon.getText().toString();

                    HashMap<String,String> qValues = new HashMap<>();

                    qValues.put("nama",nm);
                    qValues.put("telepon",tlp);
                    controller.insertData(qValues);
                    callHome();
                }
            }
        });
    }
    public void callHome(){
        Intent intent = new Intent(TemanBaru.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}