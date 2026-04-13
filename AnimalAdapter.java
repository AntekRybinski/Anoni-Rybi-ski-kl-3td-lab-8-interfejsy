package com.example.zwierzeta.adapter;

import android.content.Context;
import android.view.*;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zwierzeta.R;
import com.example.zwierzeta.model.Animal;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    List<Animal> list;
    Context context;

    public AnimalAdapter(List<Animal> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public ViewHolder(View v) {
            super(v);
            text = v.findViewById(R.id.textName);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(v);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Animal a = list.get(position);
        holder.text.setText(a.getName());

        holder.itemView.setOnClickListener(v -> {
            a.makeSound(context);
        });
    }

    public int getItemCount() {
        return list.size();
    }
}