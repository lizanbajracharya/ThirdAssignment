package com.example.thirdassignment.Fragment;


import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.thirdassignment.R;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment{
    private EditText etName,etAge,etAddress;
    private Button btnSave;
    private RadioGroup radioGroup;
    String name, age, address, gender;
    public static List<Student> studentArrayList = new ArrayList<>();

    public boolean validate() {
        if (TextUtils.isEmpty(name)) {
            etName.setError("Enter your FullName");
            etName.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(age)) {
            etAge.setError("Enter your Age");
            etAge.requestFocus();
            return false;
        }
        if (!TextUtils.isDigitsOnly(age)) {
            etAge.setError("Invalid Number");
            etAge.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(address)) {
            etAddress.setError("Enter your Address");
            etAddress.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(gender)) {
            Toast.makeText(getContext(), " Select your Gender ", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

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
        radioGroup=view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbMale) {
                    gender = "Male";
                }
                else if (i == R.id.rbFemale) {
                    gender = "Female";
                }
                else {
                    gender = "Other";
                }

            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = etName.getText().toString();
                age = etAge.getText().toString();
                address = etAddress.getText().toString();
                if (validate()) {
                    studentArrayList.add(new Student(name, age, address, gender));

                    Toast.makeText(getContext(), "Saved Successfully", Toast.LENGTH_SHORT).show();

                    etName.setText(null);
                    etAge.setText(null);
                    etAddress.setText(null);

                }
            }

        });

        return view;
    }
}
