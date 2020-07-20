package com.example.digibizpro_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_AddName extends RecyclerView.Adapter<Adapter_AddName.UserHolder> {
Context context;
ArrayList<AddName> mAddNameArrayList;

    public Adapter_AddName(Context context, ArrayList<AddName> mAddNameArrayList) {
        this.context = context;
        this.mAddNameArrayList = mAddNameArrayList;
    }

    @NonNull
    @Override
    public Adapter_AddName.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_addname, null);
        UserHolder userHolder = new UserHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_AddName.UserHolder holder, int position) {
        AddName addName = mAddNameArrayList.get(position);
        holder.mtxtname.setText(addName.getStrnm());
        holder.mtxtaddname.setText(addName.getStraddnm());
    }

    @Override
    public int getItemCount() {
        return mAddNameArrayList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        TextView mtxtname, mtxtaddname;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            mtxtname = itemView.findViewById(R.id.tvtname);
            mtxtaddname = itemView.findViewById(R.id.tvnamestring);

        }
    }
}
