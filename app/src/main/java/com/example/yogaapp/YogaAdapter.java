package com.example.yogaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class YogaAdapter extends RecyclerView.Adapter<YogaAdapter.YogaViewHolder> {

    private Context context;
    private List<YogaPose> yogaPoseList;

    public YogaAdapter(Context context, List<YogaPose> yogaPoseList) {
        this.context = context;
        this.yogaPoseList = yogaPoseList;
    }

    @NonNull
    @Override
    public YogaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_yoga_pose, parent, false);
        return new YogaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YogaViewHolder holder, int position) {
        YogaPose pose = yogaPoseList.get(position);
        holder.textView.setText(pose.getName());
        Glide.with(context).load(pose.getImageRes()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return yogaPoseList.size();
    }

    public static class YogaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public YogaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
