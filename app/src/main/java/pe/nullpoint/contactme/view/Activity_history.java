package pe.nullpoint.contactme.view;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import pe.nullpoint.contactme.R;
import pe.nullpoint.contactme.adapter.HistoryAdapterListView;
import pe.nullpoint.contactme.model.ServiceModel;

public class Activity_history extends ActionBarActivity {

    private ServiceModel oService;
    private ListView lvHistory;
    private ArrayList<ServiceModel>ls_services;
private ArrayList<String> temp_list;
    public Activity_history() {
        ls_services = new ArrayList<ServiceModel>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        temp_list = new ArrayList<String>();
        temp_list.add("Renzo0");
        temp_list.add("Renzo1");
        temp_list.add("Renzo2");
        temp_list.add("Renzo3");
        temp_list.add("Renzo4");
        temp_list.add("Renzo5");

        for (int z = 0;z < 10; z++ ){

            oService = new ServiceModel();
            oService.setCalificación(2);
            oService.setClienteID(100);
            oService.setContactoID(200);
            oService.setEstado(1);
            oService.setFechaCreacion("2015-01-01");
            oService.setFechaProgramada("2015-01-01");
            oService.setFechaRegistro("2015-01-01");
            oService.setServicioID(10011);

            ls_services.add(oService);
        }

//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,temp_list);
//        ListView  lvHistory = (ListView)findViewById(R.id.lv_history);
//        lvHistory.setAdapter(adapter);
//
        ArrayAdapter<ServiceModel> adapter = new HistoryAdapterListView(getApplicationContext(),ls_services);
        ListView  lvHistory = (ListView)findViewById(R.id.lv_history);
        lvHistory.setAdapter(adapter);
    }

    public void populateHistoryList(){

//         ArrayAdapter<ServiceModel> adapter = new HistoryAdapterListView(this,ls_services);
//        lvHistory = (ListView)findViewById(R.id.lv_history);
//        lvHistory.setAdapter(adapter);

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
