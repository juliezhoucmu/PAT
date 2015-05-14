package rectangledbmi.com.pat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import rectangledbmi.com.pittsburghrealtimetracker.R;

/**
 * Created by mizhou on 5/14/15.
 */
public class MovieAdapter extends ArrayAdapter{

    public MovieAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler {
        ImageView pic;

    }

    @Override
    public void add(Object object) {
        super.add(object);

    }


    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        DataHandler handler;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            handler.pic = (ImageView)row.findViewById(R.id.movie_pic);
            row.setTag(handler);
        }
        else {
            handler = (DataHandler)row.getTag();

        }

        MovieDataProvider dataProvider = (MovieDataProvider)this.getItem(position);
        handler.pic.setImageResource(dataProvider.getPic());
        return row;
    }
}
