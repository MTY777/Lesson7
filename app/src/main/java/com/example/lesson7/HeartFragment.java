package com.example.lesson7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lesson7.databinding.FragmentHeartBinding;
import com.example.lesson7.databinding.FragmentHomeBinding;

public class HeartFragment extends Fragment {
    private FragmentHeartBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHeartBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Oval.svg").into(binding.imageWomen);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(1).svg").into(binding.imageFata);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Oval.svg").into(binding.imageWomenSecond);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(1).svg").into(binding.imageFataSecond);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Oval.svg").into(binding.imageWomenThird);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(1).svg").into(binding.imageFataThird);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Oval.svg").into(binding.imageWomenFour);
        Glide.with(this).load("file:///C:/Users/User/Downloads/Rectangle%20(1).svg").into(binding.imageFataFour);
    }
}