package com.example.e_commerce.adapters;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerce.CoursePage;
import com.example.e_commerce.R;
import com.example.e_commerce.model.Course;

import java.util.List;

public class CourseAdapter  extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<Course> courses;

    public CourseAdapter(Context context, List<Course> courses) {
        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View courseItems = LayoutInflater.from(context).inflate(R.layout.course_item ,parent,false);
        return new CourseViewHolder(courseItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.courseBg.setCardBackgroundColor(Color.parseColor(courses.get(position).getCourse_bg_color()));

        int imageId= context.getResources().getIdentifier(courses.get(position).getCourse_image(),"drawable",context.getPackageName());
        holder.courseImg.setImageResource(imageId);
        holder.courseTitle.setText(courses.get(position).getCourse_title());
        holder.courseDate.setText(courses.get(position).getCourse_date());
        holder.courseLevel.setText(courses.get(position).getCourse_level());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, CoursePage.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context,
                        new Pair<View,String>(holder.courseImg,"course_img")
                );

                intent.putExtra("course_page_bg",Color.parseColor(courses.get(position).getCourse_bg_color()));
                intent.putExtra("course_page_title",courses.get(position).getCourse_title());
                intent.putExtra("course_page_date",courses.get(position).getCourse_date());
                intent.putExtra("course_page_level",courses.get(position).getCourse_level());
                intent.putExtra("course_page_pick",imageId);
                intent.putExtra("course_desc",courses.get(position).getCourse_desc());

                context.startActivity(intent ,options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public static final class CourseViewHolder extends RecyclerView.ViewHolder{

        CardView courseBg;
        ImageView courseImg;
        TextView courseTitle,courseDate,courseLevel;
        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            courseBg = itemView.findViewById(R.id.course_bg);
            courseTitle = itemView.findViewById(R.id.course_title);
            courseDate = itemView.findViewById(R.id.course_date);
            courseLevel = itemView.findViewById(R.id.course_level);
            courseImg = itemView.findViewById(R.id.course_pick);
        }

    }

}
