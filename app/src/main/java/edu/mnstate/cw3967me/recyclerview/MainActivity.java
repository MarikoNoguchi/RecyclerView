package edu.mnstate.cw3967me.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> studentList = new ArrayList<>();
    private RecyclerView recyclerView;
    private StudentsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new StudentsAdapter(studentList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        createStuData();
    }

    private void createStuData(){
        Student stu = new Student("100", "Joe Jones", "3.5");
        studentList.add(stu);

        stu = new Student("200", "Sally Smith", "3.8");
        studentList.add(stu);

        stu = new Student("300", "Bill Brown", "4.0");
        studentList.add(stu);

        mAdapter.notifyDataSetChanged();
    }
}
