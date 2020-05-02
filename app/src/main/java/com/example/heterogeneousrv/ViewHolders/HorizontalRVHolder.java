package com.example.heterogeneousrv.ViewHolders;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.Adapters.HorizontalAdapter;
import com.example.heterogeneousrv.Modals.HorizontalModal;
import com.example.heterogeneousrv.R;

import java.util.ArrayList;

public class HorizontalRVHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    Context context;
    public HorizontalRVHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView=itemView.findViewById(R.id.rv);
        context=itemView.getContext();

    }
    public void populate(ArrayList<HorizontalModal>data)
    {
        HorizontalAdapter adapter=new HorizontalAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
    }
}
