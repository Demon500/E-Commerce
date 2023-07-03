package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.e_commerce.adapters.CategoryAdapter;
import com.example.e_commerce.adapters.CourseAdapter;
import com.example.e_commerce.model.Category;
import com.example.e_commerce.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter category_Adapter;
    CourseAdapter course_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"Ігри"));
        categoryList.add(new Category(2,"Мови"));
        categoryList.add(new Category(3,"Сайти"));
        categoryList.add(new Category(4,"Інше"));

        setCategoryRecycler(categoryList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1,"Java","java_logo","1 січня","Початковий","#424345","test1"));
        courseList.add(new Course(2,"Python","python","10 січня","Початковий","#9FA52D","test2"));

        setCourseRecycler(courseList);

    }

    private void setCourseRecycler(List<Course> courseList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this ,RecyclerView.HORIZONTAL,false);
        courseRecycler= findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);
        course_Adapter = new CourseAdapter(this,courseList);
        courseRecycler.setAdapter(course_Adapter );
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this ,RecyclerView.HORIZONTAL,false);
        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);
        category_Adapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(category_Adapter);
    }
}