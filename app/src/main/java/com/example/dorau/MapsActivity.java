package com.example.dorau;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button BackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        BackButton = findViewById(R.id.map_back_btn);
        BackButton.setOnClickListener(view -> {
            finish();
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;

        LatLng CHUNGJU = new LatLng(36.95, 128.04);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(CHUNGJU);
        markerOptions.title("충주호");
        markerOptions.snippet("도라유");
        mMap.addMarker(markerOptions);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CHUNGJU, 10));

        LatLng DEAJEON = new LatLng(36.477613105777436, 127.48088342556962);

        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions1.position(DEAJEON);
        markerOptions1.title("대청댐");
        markerOptions1.snippet("도라유");
        mMap.addMarker(markerOptions1);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DEAJEON, 10));
    }

}
