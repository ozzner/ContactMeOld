package pe.nullpoint.contactme.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import de.hdodenhof.circleimageview.CircleImageView;
import pe.nullpoint.contactme.R;

/**
 * Created by Renzo Santillán on 30/01/2015.
 */
public class MapAdapterInfoWindow implements GoogleMap.InfoWindowAdapter {
    private LayoutInflater layInf;


    public MapAdapterInfoWindow(LayoutInflater inflater) {
        super();
        this.layInf = inflater;
    }

    public MapAdapterInfoWindow() {
    }

    @Override
    public View getInfoWindow(Marker marker) {
        View vInfWin = layInf.inflate(R.layout.adapter_infowindow,null);

        CircleImageView iv_contact = (CircleImageView)vInfWin.findViewById(R.id.cv_contact_inwi);
        TextView cv_cname = (TextView)vInfWin.findViewById(R.id.tv_cname_inwi);
        RatingBar rb_contact = (RatingBar)vInfWin.findViewById(R.id.rb_infowindow);

        iv_contact.setImageResource(R.drawable.contact1);
        cv_cname.setText(marker.getSnippet());
        rb_contact.setIsIndicator(true);
        rb_contact.setNumStars(5);
        rb_contact.setRating((float)4.25);
        return vInfWin;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
