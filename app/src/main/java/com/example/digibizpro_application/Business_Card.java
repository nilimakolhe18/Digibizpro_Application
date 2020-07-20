package com.example.digibizpro_application;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Business_Card extends Fragment {
    AdapterSerachCards adapterSerachCards;
    RecyclerView rv_searchcards;
    //  ArrayList mArrayList;

    public Business_Card() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.business_card, null);
        //  Toast.makeText(getContext(), "Business Cards", Toast.LENGTH_SHORT).show();
        //  mArrayList = new ArrayList();
        ArrayList<String> mArrayList = new ArrayList<String>();

        mArrayList.add("Steve");
        mArrayList.add("Daniel");
        mArrayList.add("John");
        mArrayList.add("Maxi");
        mArrayList.add("Jeni");

        rv_searchcards = view.findViewById(R.id.recyclerviewcards);
        adapterSerachCards = new AdapterSerachCards(getContext(), mArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        rv_searchcards.setAdapter(adapterSerachCards);
        rv_searchcards.setLayoutManager(linearLayoutManager);
        adapterSerachCards.notifyDataSetChanged();
        return view;
    }
}
