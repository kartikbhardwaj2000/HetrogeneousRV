package com.example.heterogeneousrv.ViewHolders;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.Adapters.VerticalAdapter;
import com.example.heterogeneousrv.Modals.VerticalModal;
import com.example.heterogeneousrv.R;

import java.util.ArrayList;

public class VerticalRVHolder extends RecyclerView.ViewHolder {

    RecyclerView recyclerView ;
    Context context;
    public VerticalRVHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView=itemView.findViewById(R.id.rv);
        context=itemView.getContext();

    }
    public void populate(ArrayList<VerticalModal> data)
    {
        VerticalAdapter adapter =new VerticalAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);
    }
}
