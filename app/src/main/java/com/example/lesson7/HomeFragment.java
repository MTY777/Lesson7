package com.example.lesson7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson7.databinding.FragmentHomeBinding;
import com.example.lesson7.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private ArrayList<Model> data;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MainAdapter adapter = new MainAdapter(data);
        binding.recycle.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in\n" +
                "        Japan was amazing and I want to share some photos", "September 19"));
    }
}