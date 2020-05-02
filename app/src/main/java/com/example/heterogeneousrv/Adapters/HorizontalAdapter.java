package com.example.heterogeneousrv.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.Modals.HorizontalModal;
import com.example.heterogeneousrv.ViewHolders.HorizontalViewHolder;
import com.example.heterogeneousrv.R;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalViewHolder> {
    private ArrayList<HorizontalModal> list ;

    public HorizontalAdapter(ArrayList<HorizontalModal> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_view,parent,false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
       holder.populate(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
