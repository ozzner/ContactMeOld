package pe.nullpoint.contactme.view;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import pe.nullpoint.contactme.R;

public class Activity_choose extends ActionBarActivity {

    private Button btnChoose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        btnChoose = (Button)findViewById(R.id.btn_choose);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_choose, menu);
        return true;
    }


    public void choose_click(View v){
//        Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_LONG).show();

        Intent i = new Intent(getApplication(), Activity_map.class);
        startActivity(i);
        finish();

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
