package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.myapplication.databinding.ActivityMapsBinding;

public class TypesOfMaps extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Sydney and move the camera
        LatLng kolkata = new LatLng(22.289096756662214, 88.24218758659522);
        mMap.addMarker(new MarkerOptions().position(kolkata).title("Marker in Kolkata"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kolkata));

        LatLng delhi = new LatLng(28.75631089602806, 77.29480375407792);
        mMap.addMarker(new MarkerOptions().position(delhi).title("Marker in Delhi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(delhi));

        LatLng mumbai = new LatLng(19.078304332834993, 72.88117348308211);
        mMap.addMarker(new MarkerOptions().position(mumbai).title("Marker in Mumbai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mumbai));

        LatLng chennai = new LatLng(13.249350957979486, 80.34653579894234);
        mMap.addMarker(new MarkerOptions().position(chennai).title("Marker in Chennai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chennai));

        LatLng amaravati = new LatLng(16.518183639594643, 80.50601339752843);
        mMap.addMarker(new MarkerOptions().position(amaravati).title("Marker in Amaravati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(amaravati));

        LatLng itanagar = new LatLng(27.163495593206925, 93.69963996865445);
        mMap.addMarker(new MarkerOptions().position(itanagar).title("Marker in Itanagar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(itanagar));

        LatLng patna = new LatLng(25.59594580599218, 85.13480017033515);
        mMap.addMarker(new MarkerOptions().position(patna).title("Marker in Patna"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patna));

        LatLng dispur = new LatLng(26.143350211580515, 91.79018818485333);
        mMap.addMarker(new MarkerOptions().position(dispur).title("Marker in Dispur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dispur));

        LatLng raipur = new LatLng(21.25677174152129, 81.6259366341833);
        mMap.addMarker(new MarkerOptions().position(raipur).title("Marker in Raipur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(raipur));

        LatLng gandhinagar = new LatLng(23.219116629735026, 72.64417172530442);
        mMap.addMarker(new MarkerOptions().position(gandhinagar).title("Marker in Gandhinagar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gandhinagar));

        LatLng chandigarh = new LatLng(30.737367583778028, 76.78674297889616);
        mMap.addMarker(new MarkerOptions().position(chandigarh).title("Marker in Chandigarh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chandigarh));

        LatLng shimla = new LatLng(31.193593410661215, 77.21894611374027);
        mMap.addMarker(new MarkerOptions().position(shimla).title("Marker in Shimla"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(shimla));

        LatLng ranchi = new LatLng(23.348816383120276, 85.30002788640545);
        mMap.addMarker(new MarkerOptions().position(ranchi).title("Marker in Ranchi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ranchi));

        LatLng bangalore = new LatLng(13.078823432428472, 77.62690158708564);
        mMap.addMarker(new MarkerOptions().position(bangalore).title("Marker in Bangalore"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bangalore));

        LatLng thiru = new LatLng(8.52685642763937, 76.93720046803188);
        mMap.addMarker(new MarkerOptions().position(thiru).title("Marker in Thiruvananthapuram"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(thiru));

        LatLng imphal = new LatLng(24.881369154982778, 93.9830244676493);
        mMap.addMarker(new MarkerOptions().position(imphal).title("Marker in Imphal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(imphal));

        LatLng shillong = new LatLng(25.581742116109844, 91.88842294010513);
        mMap.addMarker(new MarkerOptions().position(shillong).title("Marker in Shillong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(shillong));

        LatLng aizawl = new LatLng(23.730533216380955, 92.71991489050201);
        mMap.addMarker(new MarkerOptions().position(aizawl).title("Marker in Aizawl"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aizawl));

        LatLng  kohima= new LatLng(28.75631089602806, 77.29480375407792);
        mMap.addMarker(new MarkerOptions().position(kohima).title("Marker in Kohima"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kohima));

        LatLng bhubaneswar = new LatLng(20.29599842267802, 85.83417347438578);
        mMap.addMarker(new MarkerOptions().position(bhubaneswar).title("Marker in Bhubaneswar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bhubaneswar));

        LatLng jaipur = new LatLng(26.909140584912826, 75.7987674765302);
        mMap.addMarker(new MarkerOptions().position(jaipur).title("Marker in Jaipur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jaipur));

        LatLng gangtok = new LatLng(27.33257274097616, 88.62011152865779);
        mMap.addMarker(new MarkerOptions().position(gangtok).title("Marker in Gangtok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gangtok));

        LatLng hyderabad = new LatLng(17.492658084685786, 78.53582567787011);
        mMap.addMarker(new MarkerOptions().position(hyderabad).title("Marker in Hyderabad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hyderabad));

        LatLng agartala = new LatLng(23.83294982575213, 91.28839129052166);
        mMap.addMarker(new MarkerOptions().position(agartala).title("Marker in Agartala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(agartala));

        LatLng lucknow = new LatLng(26.846382487781803, 80.95343024584392);
        mMap.addMarker(new MarkerOptions().position(lucknow).title("Marker in Lucknow"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lucknow));

        LatLng dehradun = new LatLng(30.318593591949142, 78.02708808889166);
        mMap.addMarker(new MarkerOptions().position(dehradun).title("Marker in Dehradun"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dehradun));

        LatLng port = new LatLng(11.624402086984714, 92.73096784498435);
        mMap.addMarker(new MarkerOptions().position(port).title("Marker in Port Blair"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(port));

        LatLng daman = new LatLng(20.39764890167723, 72.83244592288135);
        mMap.addMarker(new MarkerOptions().position(daman).title("Marker in Daman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(daman));

        LatLng srinagar = new LatLng(34.08730646716891, 74.78614453213682);
        mMap.addMarker(new MarkerOptions().position(srinagar).title("Marker in Srinagar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(srinagar));

        LatLng kav = new LatLng(10.562709244429755, 72.6472862268125);
        mMap.addMarker(new MarkerOptions().position(kav).title("Marker in Kavaratti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kav));

        LatLng pon = new LatLng(11.94525809910159, 79.81145842320467);
        mMap.addMarker(new MarkerOptions().position(pon).title("Marker in Pondicherry"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pon));

        LatLng leh = new LatLng(34.15288945351884, 77.5760051009423);
        mMap.addMarker(new MarkerOptions().position(leh).title("Marker in Leh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(leh));




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}