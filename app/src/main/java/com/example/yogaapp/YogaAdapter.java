package com.example.yogaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class YogaAdapter extends BaseAdapter {

    private Context context;
    private List<YogaPose> yogaPoseList;
    private final int[] yogaimage = {R.drawable.downward_dog,R.drawable.tree_pose,R.drawable.warrior_pose,R.drawable.bridge_pose,
            R.drawable.cat_cow_pose,R.drawable.chair_pose,R.drawable.childs_pose,R.drawable.cobra_pose,R.drawable.triangle_pose};

    private  final String[] yoganame = {"downward_dog","tree_pose","warrior_pose","bridge_pose",
    "cat_cow_pose","chair_pose","childs_pose","cobra_pose","triangle_pose"};

    public YogaAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return yoganame.length;
    }

    @Override
    public Object getItem(int position) {
        return yoganame[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_yoga_pose, parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);

        imageView.setImageResource(yogaimage[position]);
        textView.setText(yoganame[position]);
        return convertView;
    }
}





