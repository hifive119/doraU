package com.example.dorau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button maps_btn = findViewById(R.id.maps_btn);
        Button bluetooth_btn = findViewById(R.id.bluetooth_btn);

        maps_btn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);
        });

        bluetooth_btn.setOnClickListener(view -> {
            Intent intent3 = new Intent(getApplicationContext(), BluetoothActivity.class);
            startActivity(intent3);
        });
    }
}