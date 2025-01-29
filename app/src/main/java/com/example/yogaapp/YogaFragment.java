package com.example.yogaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YogaFragment extends Fragment {

    private GridView gridview;

    private ArrayList<YogaPose> yogaPoses;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yoga, container, false);

        gridview = view.findViewById(R.id.gridview);
        YogaAdapter yogaAdapter = new YogaAdapter(getContext());
        gridview.setAdapter(yogaAdapter);

//        yogaPoses = new ArrayList<>();
//        yogaPoses.add(new YogaPose("Downward Dog", R.drawable.downward_dog));
//        yogaPoses.add(new YogaPose("Tree Pose", R.drawable.tree_pose));
//        yogaPoses.add(new YogaPose("Warrior pose", R.drawable.warrior_pose));
//        yogaPoses.add(new YogaPose("Child's Pose", R.drawable.childs_pose));
//        yogaPoses.add(new YogaPose("Cobra Pose", R.drawable.cobra_pose));
//        yogaPoses.add(new YogaPose("Cat-Cow Pose", R.drawable.cat_cow_pose));
//        yogaPoses.add(new YogaPose("Bridge Pose", R.drawable.bridge_pose));
//        yogaPoses.add(new YogaPose("Triangle Pose", R.drawable.triangle_pose));
//        yogaPoses.add(new YogaPose("Seated Forward Bend", R.drawable.seated_forward_bend));
//        yogaPoses.add(new YogaPose("Lotus Pose", R.drawable.lotus_pose));
//        yogaPoses.add(new YogaPose("Pigeon Pose", R.drawable.pigeon_pose));
//        yogaPoses.add(new YogaPose("Chair Pose", R.drawable.chair_pose));



        return view;
    }
}
