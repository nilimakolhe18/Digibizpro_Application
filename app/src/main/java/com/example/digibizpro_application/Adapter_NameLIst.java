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

public class Adapter_NameLIst extends RecyclerView.Adapter<Adapter_NameLIst.UserHolder> {

    ArrayList arrayList;
    Context mContext;
    public static String strnm;

    public Adapter_NameLIst(ArrayList arrayList, Context mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Adapter_NameLIst.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaper_name_list, null);
        UserHolder userHolder = new UserHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_NameLIst.UserHolder holder, int position) {
        holder.txtnm.setText((CharSequence) arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 strnm = holder.txtnm.getText().toString();
                Log.e("strnm",strnm);
                Create_Activity.edtname.setText(strnm);
                Create_Activity.alert.dismiss();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        TextView txtnm;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            txtnm = itemView.findViewById(R.id.txtnm);

        }
    }
}
