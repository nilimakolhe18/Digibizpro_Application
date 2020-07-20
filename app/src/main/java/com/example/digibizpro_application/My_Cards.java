package com.example.digibizpro_application;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class My_Cards extends Fragment {
    Adapter_MyCards adapterMyCards;
    RecyclerView rv_my_cards;
    public My_Cards(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.my_contacts_card, container, false);
        ArrayList<String> mArrayList = new ArrayList<String>();

        mArrayList.add("Steve");
        mArrayList.add("Daniel");
        mArrayList.add("John");
        mArrayList.add("Maxi");
        mArrayList.add("Jeni");

        rv_my_cards = view.findViewById(R.id.rv_my_cards);
        adapterMyCards = new Adapter_MyCards(getContext(), mArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        rv_my_cards.setAdapter(adapterMyCards);
        rv_my_cards.setLayoutManager(linearLayoutManager);
        adapterMyCards.notifyDataSetChanged();

        return view;
    }
}
