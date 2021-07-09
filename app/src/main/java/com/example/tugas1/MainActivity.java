package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Input(View view) {
            EditText inputNamaTimA = findViewById(R.id.edt_Tim_A);
            EditText inputNamaTimB = findViewById(R.id.edt_Tim_B);

            String namaTimA = inputNamaTimA.getText().toString();
            Log.d(TAG, namaTimA);

            String namaTimB = inputNamaTimB.getText().toString();
            Log.d(TAG, namaTimB);

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("Tim A", namaTimA);
            intent.putExtra("Tim B", namaTimB);
            startActivity(intent);
        }
    }
