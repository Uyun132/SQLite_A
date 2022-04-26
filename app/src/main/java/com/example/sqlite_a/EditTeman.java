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

public class EditTeman extends AppCompatActivity {
    TextInputEditText Nama, Telepon;
    Button Save;
    String nama,tlp,id;
    DBcontroler controller = new DBcontroler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_teman);

        Nama = findViewById(R.id.edNama);
        Telepon = findViewById(R.id.edTelp);
        Save = findViewById(R.id.simpanBtn);

        id = getIntent().getStringExtra("id");
        nama = getIntent().getStringExtra("nama");
        tlp = getIntent().getStringExtra("telepon");

        setTitle("Edit Nama");
        Nama.setText(nama);
        Telepon.setText(tlp);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Nama.getText().toString().equals("") || Telepon.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Mohon isi data terlebih dahulu!!!",Toast.LENGTH_LONG).show();
                }else {
                    nama = Nama.getText().toString();
                    tlp = Telepon.getText().toString();
                    HashMap<String ,String> values = new HashMap<>();
                    values.put("id",id);
                    values.put("nama",nama);
                    values.put("telepon",tlp);
                    controller.UpdateData(values);
                    callHome();
                }

            }
        });

    }
    public void callHome(){
        Intent i = new Intent(EditTeman.this,MainActivity.class);
        startActivity(i);
        finish();

    }
}