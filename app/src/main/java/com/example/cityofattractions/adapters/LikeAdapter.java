package com.example.cityofattractions.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.models.Like;

import java.util.ArrayList;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.LikeViewHolder> {
    ArrayList<Like> data;
    Context context;

    public LikeAdapter(ArrayList<Like> data, Context context) {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public LikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_like, parent, false);
        return new LikeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LikeViewHolder holder, int position) {
        final Like temp = data.get(position);

        holder.text.setText(data.get(position).getText());
        holder.date.setText(data.get(position).getDate());
        holder.img.setImageResource(data.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class LikeViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text, date;
        public LikeViewHolder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.imageNewsItem);
            text=(TextView)itemView.findViewById(R.id.textNewsItem);
            date=(TextView)itemView.findViewById(R.id.dateNewsItem);
        }
    }

}

