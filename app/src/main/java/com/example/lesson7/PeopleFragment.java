package com.example.lesson7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.lesson7.adapter.ViewPagerAdapter;
import com.example.lesson7.databinding.FragmentPeopleBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class PeopleFragment extends Fragment {
    private FragmentPeopleBinding binding;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> fragments;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPeopleBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Oval%20(1).svg").circleCrop().into(binding.imageBoy);
        fragments= new ArrayList<>();
        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        adapter = new ViewPagerAdapter(this);
        adapter.setFragments(fragments);
        binding.viewPagerAcc.setAdapter(adapter);
        new TabLayoutMediator(binding.tadleL, binding.viewPagerAcc, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(R.drawable.ic_grid  + position);
                tab.setIcon(R.drawable.ic_tags + position);
            }
        }).attach();

    }
}