package pe.nullpoint.contactme.adapter;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import pe.nullpoint.contactme.R;
import pe.nullpoint.contactme.model.ServiceModel;

/**
 * Created by Renzo Santillán on 27/01/2015.
 */
public class HistoryAdapterListView extends ArrayAdapter<ServiceModel> {

    private List<ServiceModel> services_list;
    private LayoutInflater inflater;
    private Context context;

    public HistoryAdapterListView(Context context, List<ServiceModel> items) {
        super(context, R.layout.item_list_history,items);

        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.services_list = items;
    }


    @Override
    public View getView(int index, View convertView, ViewGroup parent) {
        ViewHolder oHolder;
        View itemView = convertView;


        if(itemView == null){
            itemView = inflater.inflate(R.layout.item_list_history, parent, false);
        }

        // Find the car to work with.
        ServiceModel currentService = services_list.get(index);

//        ImageView iv_status = (ImageView)itemView.findViewById(R.id.iv_status);
//        iv_status.setImageResource(R.drawable.ic_important_green);
//
//        TextView tv_date = (TextView)itemView.findViewById(R.id.tv_date);
//        tv_date.setText(currentService.getFechaCreacion());
//
//        TextView tv_contact_name = (TextView)itemView.findViewById(R.id.tv_contact_name);
//        tv_contact_name.setText("Renzo Santillán Ch. " + index);
//
//        TextView tv_category = (TextView)itemView.findViewById(R.id.tv_category);
//        tv_category.setText("Desarrollo " + index);

        TextView tv_job = (TextView)itemView.findViewById(R.id.tv_job);
        tv_job.setText(currentService.getFechaCreacion() + index);

//        TextView tv_status = (TextView)itemView.findViewById(R.id.tv_status);
//        tv_status.setText(String.valueOf(currentService.getEstado()));




//        if (convertView == null){
//
//            convertView = inflater.inflate(R.layout.item_list_history,null);
//            oHolder = new ViewHolder();
//
//            oHolder.tv_date = (TextView)convertView.findViewById(R.id.tv_date);
//            oHolder.tv_contact_name = (TextView)convertView.findViewById(R.id.tv_contact_name);
//            oHolder.tv_category = (TextView)convertView.findViewById(R.id.tv_category);
//            oHolder.tv_job = (TextView)convertView.findViewById(R.id.tv_job);
//            oHolder.tv_status = (TextView)convertView.findViewById(R.id.tv_status);
//            oHolder.iv_status = (ImageView)convertView.findViewById(R.id.iv_status);
//
//            convertView.setTag(oHolder);
//
//        }else{
//            oHolder = (ViewHolder) convertView.getTag();
//        }
//
//        oHolder.tv_date.setText("18-may-2015 " + index);
//        oHolder.tv_contact_name.setText("Renzo Santillán Ch. " + index);
//        oHolder.tv_category.setText("Desarrollo " + index);
//        oHolder.tv_job.setText("Programador y diseña... " + index);
//
//        if (index%2 == 0){
//            oHolder.iv_status.setImageResource(R.drawable.ic_important_green);
//            oHolder.tv_status.setText("Activo. " + index);
//            oHolder.tv_status.setTextColor(Color.parseColor("#02A902"));
//        }else{
//            oHolder.tv_status.setText("Terminado. " + index);
//            oHolder.iv_status.setImageResource(R.drawable.ic_important_red);
//        }



        return itemView;
    }



    public void showMyToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }


    /* Optimize a list */
    private static class ViewHolder {

        public TextView tv_date;
        public TextView tv_contact_name;
        public TextView tv_category;
        public TextView tv_job;
        public TextView tv_status;
        public ImageView iv_status;

    }

}
