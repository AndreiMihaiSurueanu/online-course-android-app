package com.example.onlinecourseandroidapp.retrofit;

import com.example.onlinecourseandroidapp.model.CourseData;
import com.example.onlinecourseandroidapp.model.CourseDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("coursedata.json")
    Call<List<CourseData>> getAllCourses();

    @GET("video_lession.json")
    Call<List<CourseDetail>> getAllLesson();

}
