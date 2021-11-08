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
import com.example.onlinecourseandroidapp.model.CourseForYou;

import java.util.List;

public class CourseForYouAdapter extends RecyclerView.Adapter<CourseForYouAdapter.CourseForYouViewHolder> {

    Context context;
    List<CourseForYou> courseForYouList;

    public CourseForYouAdapter(Context context, List<CourseForYou> courseForYouList) {
        this.context = context;
        this.courseForYouList = courseForYouList;
    }

    @NonNull
    @Override
    public CourseForYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.courseforyou_row_item, parent, false);

        return new CourseForYouViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CourseForYouViewHolder holder, int position) {

        holder.courseName.setText(courseForYouList.get(position).getName());
        holder.totalLessons.setText(courseForYouList.get(position).getTotalLesson());

        Glide.with(context).load(courseForYouList.get(position).getImageUrl()).into(holder.courseImage);

    }

    @Override
    public int getItemCount() {
        return courseForYouList.size();
    }

    public  static class CourseForYouViewHolder extends RecyclerView.ViewHolder{

        ImageView courseImage;
        TextView courseName, totalLessons;

        public CourseForYouViewHolder(@NonNull View itemView) {
            super(itemView);

            courseImage = itemView.findViewById(R.id.course_image);
            courseName = itemView.findViewById(R.id.lesson_name);
            totalLessons = itemView.findViewById(R.id.total_lesson);

        }
    }
}
