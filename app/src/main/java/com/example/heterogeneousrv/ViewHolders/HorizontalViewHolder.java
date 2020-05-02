package com.example.heterogeneousrv.ViewHolders;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heterogeneousrv.Modals.HorizontalModal;
import com.example.heterogeneousrv.R;


public class HorizontalViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    private Context context;

    public HorizontalViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.image);
        textView=itemView.findViewById(R.id.text);
        context=itemView.getContext();
    }
    public void populate(HorizontalModal item){

        Uri uri =Uri.parse(item.getImageUri());
        imageView.setImageURI(uri);
        textView.setText(item.getImageName());

        //Glide.with(context).load("https://i.picsum.photos/id/1035/5854/3903.jpg").placeholder(R.drawable.loading_png).into(imageView);
    }
}
