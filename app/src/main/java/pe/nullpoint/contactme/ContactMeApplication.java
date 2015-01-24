package pe.nullpoint.contactme;

import android.app.Application;
import android.util.Log;

/**
 * Created by Renzo Santillán on 12/01/2015.
 */
public class ContactMeApplication extends Application {

    private final String TAG = ContactMeApplication.class.getSimpleName();

    private static ContactMeApplication oInstance = new ContactMeApplication();
    public String username;
    public String password;
    public String apiKey;


    public static ContactMeApplication getInstance() {
        return oInstance;
    }


    public ContactMeApplication() {
        Log.e(TAG,"Application init");
    }


}
