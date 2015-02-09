package pe.nullpoint.contactme.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.internal.widget.ListViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.nullpoint.contactme.R;
import pe.nullpoint.contactme.adapter.HistoryAdapter;
import pe.nullpoint.contactme.adapter.HistoryAdapterListView;
import pe.nullpoint.contactme.model.ServiceModel;

public class Activity_history extends ActionBarActivity {

    private ServiceModel oService;
    private ListView lvHistory;
    private List<ServiceModel> ls_services;
    private List<String> temp_list;
    private HistoryAdapter adapter;
    private final String TAG = Activity_history.class.getSimpleName();


    public Activity_history() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ls_services = new ArrayList<ServiceModel>();

        temp_list = new ArrayList<String>();
        temp_list.add("Renzo0");
        temp_list.add("Renzo1");
        temp_list.add("Renzo2");
        temp_list.add("Renzo3");
        temp_list.add("Renzo4");
        temp_list.add("Renzo5");


        for (int z = 0; z < 8; z++) {

            oService = new ServiceModel();

            oService.setCalificación(2);
            oService.setClienteID(100);
            oService.setContactoID(200);
            oService.setEstado(z);
            oService.setFechaCreacion("2015-0" + z + "-01");
            oService.setFechaProgramada("2015-0" + z + "-01");
            oService.setFechaRegistro("2015-0" + z + "-01");
            oService.setServicioID(10011);

            ls_services.add(oService);
        }





//      ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,temp_list);
//      ListView  lvHistory = (ListView)findViewById(R.id.lv_history);
//      lvHistory.setAdapter(adapter);

        ArrayAdapter<ServiceModel>  adapter = new HistoryAdapterListView(Activity_history.this, ls_services);

//      HistoryAdapter adapter = new HistoryAdapter(this,temp_list,null);
        lvHistory = (ListView)findViewById(R.id.lv_history);
        lvHistory.setAdapter(adapter);


        lvHistory.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent inService = new Intent(getApplication(),Activity_service.class);
               startActivity(inService);
            }
        });
    }


    public void populateHistoryList(){

//        ArrayAdapter<ServiceModel> adapter = new HistoryAdapterListView(this,ls_services);
//        lvHistory = (ListView)findViewById(R.id.lv_history);
//        lvHistory.setAdapter(adapter);

    }


    public void showMyToast(String text){
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }

    /* ------------ MENU ------------ */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_history, menu);
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
            Intent service = new Intent(getApplication(), Activity_service.class);
            startActivity(service);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
