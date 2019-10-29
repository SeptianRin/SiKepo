package com.klepon.kkn.isiwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.klepon.kkn.R;

public class wisata6 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wisata6);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoomLevel = 15.0f;
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng pongangan = new LatLng(-7.059899,110.367659);
        mMap.addMarker(new MarkerOptions().position(pongangan).title("Wisata PONGANGAN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pongangan, zoomLevel));
    }
}
