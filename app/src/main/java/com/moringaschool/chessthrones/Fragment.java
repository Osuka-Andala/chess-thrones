package com.moringaschool.chessthrones;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Fragment extends ListFragment {

    public static String[] House = {"HOUSE ARRYN", "HOUSE BARATHEON", "HOUSE BOLTON", "HOUSE FREY", "HOUSE GREYJOY", "HOUSE LANNISTER", "HOUSE MARTELL", "HOUSE STARK", "HOUSE TARGARYEN", "HOUSE TYRELL"};
    public static int[] images = {R.drawable.arryn, R.drawable.baratheon, R.drawable.bolton, R.drawable.frey, R.drawable.greyjoy, R.drawable.lannister,
            R.drawable.martell, R.drawable.stark, R.drawable.targaryen, R.drawable.tyrell};
    public static String[] Captions = {"As High As Honour", "Ours Is The Fury", "Our Blades Are Sharp", "We Take Our Tolls", "We Do Not Sow", "Hear Me Roar",
            "Unbowed, Unbent, Unbroken", "Winter Is comming", "Fire And Blood", "Growing Strong"};


    public Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_fragment, container, false);
        setListAdapter(new Myadapter(getActivity(), R.layout.activity_fragment,House,images));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private class Myadapter extends ArrayAdapter<String> {

        String[] titles, Captions;
        int[] images;

        private Myadapter(Context context, int resource, String[] title, int[] images) {
            super(context, resource, title);
            this.images = images;
            this.titles = title;
        }


        @Override
        public View getView(int position, View contentview, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.customize, parent, false);

            ImageView iv = (ImageView) row.findViewById(R.id.arryn);
            TextView tv = (TextView) row.findViewById(R.id.textview);

            iv.setImageResource(images[position]);
            tv.setText(titles[position]);

            return row;
        }
    }


    //}
//public interface Callbacks{
//    public void onItemSelected(String title, int image,String story);
//
//}
//
//
    public void onListItemClick(ListView lv, View v, int position, long id) {
        String title = House[position];
        int image = images[position];
//        String story = Captions[position];
    }
}
//    @Override
//    public void onAttach(Activity activity){
//        super.onAttach(activity);
//        this.activity = (Callbacks)activity;
//
//    }
//}
