package com.example.onlinecourseandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.onlinecourseandroidapp.model.CourseDetail;
import com.example.onlinecourseandroidapp.retrofit.ApiInterface;
import com.example.onlinecourseandroidapp.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CourseDetails extends AppCompatActivity {

    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);



        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);

        Call<List<CourseDetail>> call = apiInterface.getAllLesson();

        call.enqueue(new Callback<List<CourseDetail>>() {
            @Override
            public void onResponse(Call<List<CourseDetail>> call, Response<List<CourseDetail>> response) {

                List<CourseDetail> courseDataList = response.body();

            }



            @Override
            public void onFailure(Call<List<CourseDetail>> call, Throwable t) {

            }
        });


    }
}
