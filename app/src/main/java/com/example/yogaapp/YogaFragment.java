package com.example.yogaapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YogaFragment extends Fragment {

    private RecyclerView recyclerView;
    private YogaAdapter yogaAdapter;
    private ArrayList<YogaPose> yogaPoses;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yoga, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        yogaPoses = new ArrayList<>();
        yogaPoses.add(new YogaPose("Downward Dog", R.drawable.downward_dog));
        yogaPoses.add(new YogaPose("Tree Pose", R.drawable.tree_pose));
        yogaPoses.add(new YogaPose("Warrior Pose", R.drawable.warrior_pose));

        yogaAdapter = new YogaAdapter(getContext(), yogaPoses);
        recyclerView.setAdapter(yogaAdapter);

        return view;
    }
}
