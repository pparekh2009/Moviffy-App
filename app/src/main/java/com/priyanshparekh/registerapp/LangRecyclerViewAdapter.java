package com.priyanshparekh.registerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LangRecyclerViewAdapter extends RecyclerView.Adapter<LangRecyclerViewAdapter.ViewHolder> {

    String[] languages = new String[]{"English", "Hindi", "Gujarati", "Marathi", "Tamil", "Telugu", "Bengali"};

    @NonNull
    @Override
    public LangRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LangRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.langTv.setText(languages[position]);
    }

    @Override
    public int getItemCount() {
        return languages.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView langTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            langTv = itemView.findViewById(R.id.item_text);
        }
    }
}
