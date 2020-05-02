package com.example.heterogeneousrv.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.R;
import com.example.heterogeneousrv.Modals.VerticalModal;
import com.example.heterogeneousrv.ViewHolders.VerticalViewHolder;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalViewHolder> {
    private ArrayList<VerticalModal> list;

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_view,parent,false);
        return new VerticalViewHolder(view);
    }

    public VerticalAdapter(ArrayList<VerticalModal> list) {
        this.list = list;
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        holder.populate(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
