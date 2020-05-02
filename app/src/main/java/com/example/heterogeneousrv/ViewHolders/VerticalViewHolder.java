package com.example.heterogeneousrv.ViewHolders;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.Modals.VerticalModal;
import com.example.heterogeneousrv.R;

public class VerticalViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    private Context context;
    public VerticalViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.image);
        textView=itemView.findViewById(R.id.text);
        context=itemView.getContext();
    }

    public void populate(VerticalModal item){
        textView.setText(item.getImageName());
        Uri uri2 =Uri.parse("android.resource://com.example.heterogeneousrv/drawable/avengers3");
        Uri uri =Uri.parse(item.getImageUri());


        imageView.setImageURI(uri);
        //Glide.with(context).load("https://i.picsum.photos/id/1025/4951/3301.jpg").placeholder(R.drawable.loading_png).into(imageView);

    }
}
