package com.example.thirdassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.thirdassignment.R;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PrintStream;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment{
    private EditText etName,etAge,etAddress;
    private Button btnSave;
    private RadioButton rdoMale,rdoFemale,rdoOther;
    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add, container, false);
        etName=view.findViewById(R.id.etFullname);
        etAge=view.findViewById(R.id.etAge);
        etAddress=view.findViewById(R.id.etAddress);
        btnSave=view.findViewById(R.id.btnSave);
        rdoMale=view.findViewById(R.id.rbMale);
        rdoFemale=view.findViewById(R.id.rbFemale);
        rdoOther=view.findViewById(R.id.rbOther);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name,Age,Address;
                Name=etName.getText().toString();
                Age=etAge.getText().toString();
                Address=etAddress.getText().toString();

            }
        });
        return view;
    }

}
