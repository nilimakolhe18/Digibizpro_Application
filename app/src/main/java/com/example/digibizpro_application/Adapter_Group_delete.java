package com.example.digibizpro_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Group_delete extends RecyclerView.Adapter<Adapter_Group_delete.UserHolder> {
    ArrayList arrayList;
    Context context;

    public Adapter_Group_delete(ArrayList arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter_Group_delete.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_aadapter_grpdelete, null);
        UserHolder userHolder = new UserHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_Group_delete.UserHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        CheckBox checkbox;


        public UserHolder(@NonNull View itemView) {
            super(itemView);
            checkbox = itemView.findViewById(R.id.checkbox);

        }
    }
}
