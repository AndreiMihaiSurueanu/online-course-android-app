package com.example.onlinecourseandroidapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.onlinecourseandroidapp.R;
import com.example.onlinecourseandroidapp.model.PopularCourse;

import java.util.List;

public class PopularCourseAdapter extends RecyclerView.Adapter<PopularCourseAdapter.PopulatViewHolder> {

        Context context;
        List<PopularCourse> popularCourseList;

    public PopularCourseAdapter(Context context, List<PopularCourse> popularCourseList) {
        this.context = context;
        this.popularCourseList = popularCourseList;
    }

    @NonNull
    @Override
    public PopulatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.popular_row_item, parent, false);

        return new PopulatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PopulatViewHolder holder, int position) {

        holder.courseName.setText(popularCourseList.get(position).getName());
        holder.totalLessons.setText(popularCourseList.get(position).getTotalLesson());

        Glide.with(context).load(popularCourseList.get(position).getImageUrl()).into(holder.courseImage);
    }

    @Override
    public int getItemCount() {
        return popularCourseList.size();
    }

    public  static class PopulatViewHolder extends RecyclerView.ViewHolder{

        ImageView courseImage;
        TextView courseName, totalLessons;

        public PopulatViewHolder(@NonNull View itemView) {
            super(itemView);

            courseImage = itemView.findViewById(R.id.course_image);
            courseName = itemView.findViewById(R.id.lesson_name);
            totalLessons = itemView.findViewById(R.id.total_lesson);

        }
    }
}