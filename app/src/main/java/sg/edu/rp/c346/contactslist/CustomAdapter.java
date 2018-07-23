package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16038911 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<Contacts> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource; // info_item.xml
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCC = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhoneNo = rowView.findViewById(R.id.textViewNumber);

        Contacts currentItem = contactList.get(position);

        String name = currentItem.getName();
        int cc = currentItem.getCountryCode();
        int phoneno = currentItem.getPhoneNo();

        tvName.setText(name);
        tvCC.setText("+" + cc + "");
        tvPhoneNo.setText(phoneno + "");

        return rowView;

    }
}
