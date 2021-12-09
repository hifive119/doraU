package com.example.dorau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton maps_btn = findViewById(R.id.maps_btn);
        ImageButton bluetooth_btn = findViewById(R.id.bluetooth_btn);
        ImageButton led_btn = findViewById(R.id.led_btn);
        ImageButton beam_btn = findViewById(R.id.beam_btn);

        maps_btn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);
        });

        bluetooth_btn.setOnClickListener(view -> {
            Intent intent3 = new Intent(getApplicationContext(), BluetoothActivity.class);
            startActivity(intent3);
        });

        led_btn.setOnClickListener(view -> {
            Intent intent3 = new Intent(getApplicationContext(), LedBluetoothActivity.class);
            startActivity(intent3);
        });

        beam_btn.setOnClickListener(view -> {
            Intent intent4 = new Intent(getApplicationContext(), BeamActivity.class);
            startActivity(intent4);
        });
    }
}