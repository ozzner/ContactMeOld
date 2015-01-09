package pe.nullpoint.contactme;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pe.nullpoint.contactme.view.Activity_choose;
import pe.nullpoint.contactme.view.Activity_register;


public class ContactMe extends ActionBarActivity {

    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me);
        btnIniciar = (Button)findViewById(R.id.btn_splash);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact_me, menu);
        return true;
    }



    public void iniciar_click(View v){
//        Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_LONG).show();

        Intent i = new Intent(getApplication(), Activity_register.class);
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
