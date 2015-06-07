package com.howtoevery.sunshinenew.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Create an ArrayList to put data into the ListView
        ArrayList<String> stringList = new ArrayList<>();
        //Add values to the ArrayList from the strings.xml file.
        stringList.add(getString(R.string.forecast_data1));
        stringList.add(getString(R.string.forecast_data2));
        stringList.add(getString(R.string.forecast_data3));
        stringList.add(getString(R.string.forecast_data3));
        stringList.add(getString(R.string.forecast_data4));
        stringList.add(getString(R.string.forecast_data5));
        stringList.add(getString(R.string.forecast_data6));


        /*
        // This is how they did it in the Udacity course:
        String [] forecastArray = { // we create a simple array to hold all the data
                getString(R.string.forecast_data1), // a comma to seperate each array item.
                getString(R.string.forecast_data2),
                getString(R.string.forecast_data3),
                getString(R.string.forecast_data4),
                getString(R.string.forecast_data5),
                getString(R.string.forecast_data6)
        }; // end of forecastArray String array.

        //Now we make this array to be a List

        List<String> weekForecast = new ArrayList<>( // build a new String List
                Arrays.asList(forecastArray) // use Arrays.asList to change the array to be a List
        ); //end of weekForecast String List.

        */

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<> ( // create a new String ArrayAdapter with these parameters:
                getActivity(), //parameter 1: Context
                R.layout.list_item_foreast, // parameter 2: the layout for how this adapter will look
                R.id.list_item_forecast_textview, // parameter 3: the id of the TextView that we want it to look like
                stringList // the ArrayList of data to use
        ); // end of ArrayAdapter creation.

        //without all comments it can look like this:
        // new ArrayAdapter<String> (getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, stringList);


        View rootView = inflater.inflate(R.layout.fragment_main, container, false); // makes the fragment_main a rootView.

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


}
