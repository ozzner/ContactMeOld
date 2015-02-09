package pe.nullpoint.contactme.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.nullpoint.contactme.R;
import pe.nullpoint.contactme.model.ServiceModel;
import pe.nullpoint.contactme.view.Activity_history;

/**
 * Created by Renzo Santillán on 31/01/2015.
 */
public class HistoryAdapter extends BaseAdapter {

    private  Context context;
    private List<String> services_list;
    private LayoutInflater inflater;


    public HistoryAdapter(Context context, List<String> services_list, LayoutInflater inflater) {
        this.context = context;
        this.services_list = services_list;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        View row_view = view;
        ViewHolder oHolder;


        if (inflater == null)
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if (row_view == null){

            row_view = inflater.inflate(R.layout.item_list_history,null);
//            oHolder = new ViewHolder();
//
//            oHolder.tv_date = (TextView)row_view.findViewById(R.id.tv_date);
//            oHolder.tv_contact_name = (TextView)row_view.findViewById(R.id.tv_contact_name);
//            oHolder.tv_category = (TextView)row_view.findViewById(R.id.tv_category);
//            oHolder.tv_job = (TextView)row_view.findViewById(R.id.tv_job);
//            oHolder.tv_status = (TextView)row_view.findViewById(R.id.tv_status);



//            row_view.setTag(oHolder);

        }else {
            oHolder = (ViewHolder) row_view.getTag();
        }

//        TextView tv_date = (TextView)row_view.findViewById(R.id.tv_date);
//        TextView tv_contact_name = (TextView)row_view.findViewById(R.id.tv_contact_name);
//        TextView tv_category = (TextView)row_view.findViewById(R.id.tv_category);
        TextView tv_job = (TextView)row_view.findViewById(R.id.tv_job);
//        TextView tv_status = (TextView)row_view.findViewById(R.id.tv_status);

//        oHolder.tv_date.setText("18-may-2015 " + index);
//        oHolder.tv_status.setText("pendiente " + index);
//        oHolder.tv_contact_name.setText("Renzo Santillán Ch. " + index);
//        oHolder.tv_category.setText("Desarrollo " + index);
//        oHolder.tv_job.setText("Programador y diseñador android " + index);

//         tv_date.setText("18-may-2015 " + index);
//
//         if (index%2 == 0){
//             tv_status.setText("Activo " + index);
//         }else{
//             tv_status.setText("Terminado " + index);
//         }
//
//         tv_contact_name.setText("Renzo Santillán Ch. " + index);
//         tv_category.setText("Desarrollo " + index);
//         tv_job.setText("Programador y diseñador... " + index);

        return row_view;
    }


    /* Optimize a list */
    private static class ViewHolder {

        public TextView tv_date;
        public TextView tv_contact_name;
        public TextView tv_category;
        public TextView tv_job;
        public TextView tv_status;

    }

    public void showMyToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

//
//    @Override
//    public void onItemClick(AdapterViewCompat<?> adapterViewCompat, View view, int i, long l) {
//        showMyToast("Click " + i);
//        Log.e("Click","CLickk");
//    }
}
