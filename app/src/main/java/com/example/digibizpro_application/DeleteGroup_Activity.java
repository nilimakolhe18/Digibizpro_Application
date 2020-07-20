package com.example.digibizpro_application;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DeleteGroup_Activity extends AppCompatActivity {
    ArrayList arrayList_deletegroups;
    RecyclerView rv_deletegroups;
    Adapter_Group_delete adapter_group_delete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deletegroup_activity);

        arrayList_deletegroups = new ArrayList();
        arrayList_deletegroups.add("Name");
        arrayList_deletegroups.add("Prefix");
        arrayList_deletegroups.add("Mobile No.");
        arrayList_deletegroups.add("Work");
        arrayList_deletegroups.add("Work Home");
        arrayList_deletegroups.add("Prefix");
        arrayList_deletegroups.add("Mobile No.");
        arrayList_deletegroups.add("Work");
        arrayList_deletegroups.add("Work Home");

        rv_deletegroups = findViewById(R.id.rv_deletegroups);
        adapter_group_delete = new Adapter_Group_delete(arrayList_deletegroups, getApplicationContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        rv_deletegroups.setLayoutManager(linearLayoutManager);
        rv_deletegroups.setAdapter(adapter_group_delete);


    }
}
