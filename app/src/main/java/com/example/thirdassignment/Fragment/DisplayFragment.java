package com.example.thirdassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thirdassignment.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {

    RecyclerView recyclerView;
    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_display, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(R.drawable.ic_launcher_background,"Lizan","Patan","21","Male"));

        StudentAdapter studentAdapter=new StudentAdapter(getActivity(),studentList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }

}
