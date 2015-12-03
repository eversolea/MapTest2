package test.maptest2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        // Add a marker in Rexburg and move the camera
        LatLng rexburg = new LatLng(43.8332, -111.7897);
        mMap.addMarker(new MarkerOptions().position(rexburg).title("Marker in Rexburg"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rexburg));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rexburg, 13));

        LatLng MattHouse = new LatLng(43.81914,-111.8091645);
        mMap.addMarker(new MarkerOptions().position(MattHouse).title("Man pulled a gun on me").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng GoodGuyGregHouse = new LatLng(43.828540,-111.774496);
        mMap.addMarker(new MarkerOptions().position(GoodGuyGregHouse).title("This guy gave me a free XBOX and took the offer!").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

    }
}
