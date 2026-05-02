package com.example.lab10dmonavigationdraweretfragments;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.fragment.app.ListFragment;

public class ItemListFragment extends ListFragment {

    private static final String[] ITEMS = {
            "Pomme", "Banane", "Raisin",
            "Fraise", "Mangue", "Peche",
            "Cerise", "Citron", "Kiwi", "Ananas"
    };

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                ITEMS
        );
        setListAdapter(listAdapter);
    }
}