package com.example.thirdassignment.Fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdassignment.DashboardActivity;
import com.example.thirdassignment.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ContactsViewHolder>{
    List<Student> studentList;
    //constructor to receive the data from activity
    public StudentAdapter(List<Student> studentList)
    {
        this.studentList=studentList;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.display,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder,final int position) {
        final Student student=studentList.get(position);
        String gender = student.getGender();
        holder.tvName.setText(student.getName());
        holder.tvAddress.setText(student.getAddress());
        holder.tvAge.setText(student.getAge());
        holder.tvGender.setText(student.getGender());
        if (gender.equals("Male")) {
            holder.imgImage.setImageResource(R.drawable.male);
        } else if (gender.equals("Female")) {
            holder.imgImage.setImageResource(R.drawable.female);
        } else {
            holder.imgImage.setImageResource(R.drawable.other);
        }
        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentList.remove(student);
                notifyItemRemoved(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgImage,imgDelete;
        TextView tvAddress,tvName,tvAge,tvGender;
        public ContactsViewHolder(@NonNull View itemView){
            super(itemView);
            imgImage=itemView.findViewById(R.id.imgImage);
            tvAddress=itemView.findViewById(R.id.tvAddress);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvGender=itemView.findViewById(R.id.tvGender);
            imgDelete=itemView.findViewById(R.id.imgDelete);
        }
    }
}
