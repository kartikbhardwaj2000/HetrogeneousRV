package com.example.heterogeneousrv.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.ViewHolders.HorizontalRVHolder;
import com.example.heterogeneousrv.Modals.HorizontalRVModal;
import com.example.heterogeneousrv.R;
import com.example.heterogeneousrv.ViewHolders.VerticalRVHolder;
import com.example.heterogeneousrv.Modals.VerticalRVModal;

import java.util.ArrayList;

public class MainRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Object> list;
    final private int HORIZONTAL =0;
    final private int VERTICAL=1;


    @Override
    public int getItemViewType(int position) {
        if(list.get(position) instanceof HorizontalRVModal)
        {
            return  HORIZONTAL;
        }else if(list.get(position)instanceof VerticalRVModal)
        {
            return VERTICAL;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        RecyclerView.ViewHolder viewHolder =null;
        switch (viewType){
            case VERTICAL:
                view=inflater.inflate(R.layout.vertical_rv,parent,false);
                viewHolder =new VerticalRVHolder(view);
                break;
            case HORIZONTAL:
                view=inflater.inflate(R.layout.horizontal_rv,parent,false);
                viewHolder=new HorizontalRVHolder(view);

        }
        return viewHolder;

    }

    public MainRVAdapter(ArrayList<Object> list) {
        this.list = list;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder.getItemViewType()==VERTICAL){
            VerticalRVHolder verticalViewHolder =(VerticalRVHolder)holder;
            VerticalRVModal item =(VerticalRVModal)list.get(position);

            verticalViewHolder.populate(item.getList());

        }
        else{
            HorizontalRVHolder horizontalViewHolder =(HorizontalRVHolder)holder;
            HorizontalRVModal item =(HorizontalRVModal) list.get(position);

            horizontalViewHolder.populate(item.getData());

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
