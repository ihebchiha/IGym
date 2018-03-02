package gymapp.ihebchiha.com.igym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import gymapp.ihebchiha.com.igym.Extras.MenuList;

/**
 * Created by IhebChiha on 25/02/2018.
 */

public class MenuAdapter extends ArrayAdapter<MenuList> {
    Context mContext;
    int mLayoutResourceId;
    MenuList mData[] = null;

 public MenuAdapter(Context context, int resource, MenuList[] data) {
 super(context, resource, data);
        this.mContext = context;
        this.mLayoutResourceId = resource;
       this.mData = data;
    }


      @Override
        public MenuList getItem(int position) {
            return super.getItem(position);
         }

         @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
         //inflate the layout for a single row
         LayoutInflater inflater = LayoutInflater.from(mContext);
         row = inflater.inflate(mLayoutResourceId,parent,false);

         //get a reference to the different view elements we wish to update

         TextView nameView = (TextView) row.findViewById(R.id.nameView);
         ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

         //get the data from the data array
         MenuList menu = mData[position];

         //setting the view to reflect the data we need to display
             nameView.setText(menu.getmNameOfMenu());

             int resId = mContext.getResources().getIdentifier(menu.getmNameOfImage(),"drawable",mContext.getPackageName());
              imageView.setImageResource(resId);

              //returning the row view (because this is called getView after all)
              return row;


              }
}

