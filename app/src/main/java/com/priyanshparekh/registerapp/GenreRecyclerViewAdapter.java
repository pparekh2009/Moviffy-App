package com.priyanshparekh.registerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GenreRecyclerViewAdapter extends RecyclerView.Adapter<GenreRecyclerViewAdapter.ViewHolder> {

    String[] genres = new String[]{"Drama", "Action", "Horror", "Comedy", "Romance"};

    @NonNull
    @Override
    public GenreRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenreRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.genreTv.setText(genres[position]);
    }

    @Override
    public int getItemCount() {
        return genres.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView genreTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            genreTv = itemView.findViewById(R.id.item_text);
        }
    }
}
