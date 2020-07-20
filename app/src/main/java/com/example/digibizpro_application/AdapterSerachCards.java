package com.example.digibizpro_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterSerachCards extends RecyclerView.Adapter<AdapterSerachCards.UserHolder> {
    Context context;
    ArrayList mAddNameArrayList;

    public AdapterSerachCards(Context context, ArrayList mAddNameArrayList) {
        this.context = context;
        this.mAddNameArrayList = mAddNameArrayList;
    }

    @NonNull
    @Override
    public AdapterSerachCards.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_search_cards, null);
        UserHolder userHolder = new UserHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        // AddName addName = mAddNameArrayList.get(position);
        holder.mtxt1.setText((CharSequence) mAddNameArrayList.get(position));

//        holder.i1.setText((CharSequence) mAddNameArrayList.get(position));
//        holder.mtxt1.setText((CharSequence) mAddNameArrayList.get(position));
//        holder.mtxt1.setText((CharSequence) mAddNameArrayList.get(position));
//        holder.mtxt1.setText((CharSequence) mAddNameArrayList.get(position));
//        holder.mtxt1.setText((CharSequence) mAddNameArrayList.get(position));
//        holder.mtxt1.setText((CharSequence) mAddNameArrayList.get(position));

    }


    @Override
    public int getItemCount() {
        return mAddNameArrayList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        TextView mtxt1;
        ImageView i1, i2, i3, i4, i5, i6;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            mtxt1 = itemView.findViewById(R.id.txt1);
            i1 = itemView.findViewById(R.id.im1);
            i2 = itemView.findViewById(R.id.im2);
            i3 = itemView.findViewById(R.id.im3);
            i4 = itemView.findViewById(R.id.im4);
            i5 = itemView.findViewById(R.id.im5);
            i6 = itemView.findViewById(R.id.im6);


        }
    }
}

