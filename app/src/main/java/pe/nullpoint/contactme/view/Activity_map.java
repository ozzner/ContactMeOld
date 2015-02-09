package pe.nullpoint.contactme.view;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import pe.nullpoint.contactme.R;
import pe.nullpoint.contactme.adapter.MapAdapterInfoWindow;

public class Activity_map extends ActionBarActivity implements OnMapReadyCallback,GoogleMap.OnInfoWindowClickListener{

    private Button btnMap;
    private GoogleMap map;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        actionBar = getSupportActionBar();
//        actionBar.setTitle(Html.fromHtml("<font color='#E9BD15'>Cesar Lopez H.</font>"));
        actionBar.setTitle("Cesar Lopez H.");
        actionBar.setSubtitle("Last: contruction");
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    public void map_click(View v){
        Intent i = new Intent(getApplication(), Activity_profile.class);
        startActivity(i);
//        finish();
//        showMyToast("Click to profile");
    }

    public void showMyToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        map.setOnInfoWindowClickListener(this);

        map.addMarker(new MarkerOptions()
                        .position(new LatLng(-12.231267, -76.910325))
                        .title("Plaza Vea - Jose Gálvez")
                        .snippet("Renzo santillán")
        .icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker_map_2)));

        map.setMyLocationEnabled(true);

        CameraUpdate camera = CameraUpdateFactory.newLatLngZoom(
                new LatLng(-12.231267, -76.910325), 13f);
        map.animateCamera(camera);
        map.setInfoWindowAdapter(new MapAdapterInfoWindow(getLayoutInflater()));
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        Intent i = new Intent(getApplication(), Activity_profile.class);
        startActivity(i);
    }
}
