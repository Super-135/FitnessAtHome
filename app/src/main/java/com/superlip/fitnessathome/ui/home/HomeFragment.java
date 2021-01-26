package com.superlip.fitnessathome.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.superlip.fitnessathome.Adapters.HomeAdapter;
import com.superlip.fitnessathome.HomeElement;
import com.superlip.fitnessathome.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findView(view);
        setupRecyclerView();
    }

    private void findView(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }


    private void setupRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        HomeAdapter adapter = new HomeAdapter(readData());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<HomeElement> readData(){

        HomeElement homeElement = new HomeElement(getString(R.string.Push_Ups), 0, 100, 37, 1);
        ArrayList<HomeElement> homeElements;
        homeElements = new ArrayList<>();
        homeElements.add(homeElement);

        return homeElements;
    }



}