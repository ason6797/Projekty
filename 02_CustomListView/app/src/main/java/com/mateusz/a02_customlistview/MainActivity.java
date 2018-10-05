package com.mateusz.a02_customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<StudentItem> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listViewStudents);

        students = new ArrayList<>();

        students.add(new StudentItem("Albert",18, "https://s3.amazonaws.com/uifaces/faces/twitter/sauro/128.jpg"));
        students.add(new StudentItem("Oscar",18, "https://s3.amazonaws.com/uifaces/faces/twitter/ashleyford/128.jpg"));
        students.add(new StudentItem("Mateusz",18, "https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg"));

        StudentAdapter adapter = new StudentAdapter(
                this,
                R.layout.student_item,
                students
        );

        lista.setAdapter(adapter);
    }
}
