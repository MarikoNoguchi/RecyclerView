package edu.mnstate.cw3967me.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by marikonoguchi on 11/9/16.
 */
public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.MyViewHolder> {
    private List<Student> studentList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView id, name, gpa;

        public MyViewHolder(View view){
            super(view);
            id = (TextView) view.findViewById(R.id.id);
            name = (TextView) view.findViewById(R.id.name);
            gpa = (TextView) view.findViewById(R.id.gpa);
        }
    }

    public StudentsAdapter(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.stu_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        Student stu = studentList.get(position);
        holder.id.setText(stu.getId());
        holder.name.setText(stu.getName());
        holder.gpa.setText(stu.getGpa());
    }

    @Override
    public int getItemCount(){
        return studentList.size();
    }
}
