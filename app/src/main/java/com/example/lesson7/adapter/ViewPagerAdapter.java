package com.example.lesson7.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {
private ArrayList<Fragment> fragments;

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }
    public void setFragments(ArrayList<Fragment> fragments){
        this.fragments = new ArrayList<>();
        this.fragments.addAll(fragments);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
