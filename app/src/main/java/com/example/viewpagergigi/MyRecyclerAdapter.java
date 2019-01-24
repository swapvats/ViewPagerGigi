package com.example.viewpagergigi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    ArrayList<Chitra> myPhotos = new ArrayList<>();
    Context context;

    public MyRecyclerAdapter(ArrayList<Chitra> myPhotos, Context context) {
        this.myPhotos = myPhotos;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText.setText(myPhotos.get(position).getPhotoText());
        int id = myPhotos.get(position).getPhotoId();

        Glide.with(context)
                .load(id)
                .into(holder.myImage);

    }

    @Override
    public int getItemCount() {
        return myPhotos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView myImage;
        TextView myText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage = itemView.findViewById(R.id.recyclerItemImage);
            myText = itemView.findViewById(R.id.recyclerItemText);
        }
    }

}
