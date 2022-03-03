package com.example.lesson7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson7.databinding.ItemBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private ArrayList<Model> data;

    public MainAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        private ItemBinding binding;

        public MainViewHolder(@NonNull ItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model s) {
            binding.tvContent.setText(s.getTextv_content());
            binding.tvData.setText(s.getTextv_data());
            binding.image.setImageResource(s.getImage());
        }
    }
}
