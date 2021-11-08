package com.example.onlinecourseandroidapp.retrofit;

import com.example.onlinecourseandroidapp.model.CourseData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("coursedata.json")
    Call<List<CourseData>> getAllCourses();

}
