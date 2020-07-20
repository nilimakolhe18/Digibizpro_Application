package com.example.digibizpro_application;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_phone_list  extends RecyclerView.Adapter<Adapter_phone_list.UserHolder> {

    ArrayList arrayList;
    Context mContext;
    public static String strnm;

    public Adapter_phone_list(ArrayList arrayList, Context mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Adapter_phone_list.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaper_phone_list, null);
       UserHolder userHolder = new UserHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_phone_list.UserHolder holder, int position) {
        holder.txtphone.setText((CharSequence) arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strnm = holder.txtphone.getText().toString();
                Log.e("strnm",strnm);
                Create_Activity.txtphone_number.setText(strnm);
                Create_Activity.alert.dismiss();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        TextView txtphone;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            txtphone = itemView.findViewById(R.id.txtphone);

        }
    }
}
