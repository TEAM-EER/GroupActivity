package com.example.googlemapapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        LatLng UCNHS = new LatLng(15.979523615079602, 120.56354102275198);
        mMap.addMarker(new MarkerOptions()
                .position(UCNHS)
                .title("Urdaneta City National HighSchool")
);
        mMap.moveCamera(CameraUpdateFactory
                .newLatLng(UCNHS));

        LatLng BNHS = new LatLng(15.8958, 120.6742);
        mMap.addMarker(new MarkerOptions()
                .position(BNHS)
                .title("Balungao National High School"));
        mMap.moveCamera(CameraUpdateFactory
                .newLatLng(BNHS));

        LatLng LC = new LatLng(16.03005045214454, 120.74164860793601);
        mMap.addMarker(new MarkerOptions()
                .position(LC)
                .title("Luna Colleges"));
        mMap.moveCamera(CameraUpdateFactory
                .newLatLng(LC));




        }
    }
