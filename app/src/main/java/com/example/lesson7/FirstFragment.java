package com.example.lesson7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lesson7.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageFirst);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageSecond);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageThird);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageFourth);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageFifth);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageSixth);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageSeventh);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageEaight);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(2).svg").into(binding.imageNineth);
    }
}