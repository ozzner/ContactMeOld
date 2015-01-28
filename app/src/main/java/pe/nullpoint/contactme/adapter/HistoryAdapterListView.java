package pe.nullpoint.contactme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pe.nullpoint.contactme.R;
import pe.nullpoint.contactme.model.ServiceModel;

/**
 * Created by Renzo Santillán on 27/01/2015.
 */
public class HistoryAdapterListView extends ArrayAdapter<ServiceModel>{

    private ArrayList<ServiceModel> list_services;
    private LayoutInflater layIn;

    private String sCat;
    private String sJob;
    private String sDate;
    private String sName;
    private int status;



    public HistoryAdapterListView(Context context, ArrayList<ServiceModel>services) {
        super(context, R.layout.item_list_history, services);

        this.list_services = services;
        this.layIn = LayoutInflater.from(context);

    }

    @Override
    public View getView(int index, View convertView, ViewGroup parent) {
        View itemView = convertView;
        ViewHolder oHolder = new ViewHolder();
        ServiceModel oService = list_services.get(index);


        if (itemView == null){

            itemView = layIn.inflate(R.layout.item_list_history,null);

            oHolder.tv_category = (TextView)itemView.findViewById(R.id.tv_category);
            oHolder.tv_contact_name = (TextView)itemView.findViewById(R.id.tv_contact_name);
            oHolder.tv_date = (TextView)itemView.findViewById(R.id.tv_date);
            oHolder.tv_job = (TextView)itemView.findViewById(R.id.tv_job);
            oHolder.tv_status = (TextView)itemView.findViewById(R.id.tv_status);

            itemView.setTag(oHolder);

        }else{
            oHolder = (ViewHolder) itemView.getTag();
        }


        /* set temp values */
        sName = "Renzo Santillán ." + index;
        sCat  = "Desarrollo" + index;
        sJob  = "Programador Android" + index;
        sDate = "18-may-2006" + index;
        String sStatus = "Pendiente" + index;

        oHolder.tv_category.setText(sCat);
        oHolder.tv_contact_name.setText(sName);
        oHolder.tv_date.setText(sDate);
        oHolder.tv_job.setText(sJob);
        oHolder.tv_status.setText(sStatus);

        return itemView;
    }


    /* Optimize a list */
    private static class ViewHolder {

        public TextView tv_date;
        public TextView tv_contact_name;
        public TextView tv_category;
        public TextView tv_job;
        public TextView tv_status;

    }

}
