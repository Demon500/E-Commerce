package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CoursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        ConstraintLayout course_page_bg = findViewById(R.id.coursePageBg);
        ImageView course_page_pick = findViewById(R.id.course_page_pick);
        TextView course_page_title = findViewById(R.id.course_page_title);
        TextView course_page_date = findViewById(R.id.course_page_date);
        TextView course_page_level = findViewById(R.id.course_page_level);
        TextView course_desc = findViewById(R.id.course_desc);

        //det recieved values to component
        course_page_bg.setBackgroundColor(getIntent().getIntExtra("course_page_bg",0));
        course_page_pick.setImageResource(getIntent().getIntExtra("course_page_pick",0));
        course_page_title.setText(getIntent().getStringExtra("course_page_title"));
        course_page_level.setText(getIntent().getStringExtra("course_page_level"));
        course_page_date.setText(getIntent().getStringExtra("course_page_date"));
        course_desc.setText(getIntent().getStringExtra("course_desc"));

    }
}