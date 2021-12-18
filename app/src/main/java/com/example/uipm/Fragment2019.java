package com.example.uipm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag2018#} factory method to
 * create an instance of this fragment.
 */
public class Fragment2019 extends Fragment {

    public Fragment2019(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View frag2 = inflater.inflate(R.layout.fragment_2018, container, false);
        String[] menuItems={"iin", "iin","ini","ian","nai"};
        ListView listview = (ListView) frag2.findViewById(R.id.list);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_expandable_list_item_1,
                menuItems
        );

        listview.setAdapter(listViewAdapter);
        return frag2;
    }
}