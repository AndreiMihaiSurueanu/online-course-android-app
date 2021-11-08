package com.example.onlinecourseandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.onlinecourseandroidapp.model.CourseData;
import com.example.onlinecourseandroidapp.retrofit.ApiInterface;
import com.example.onlinecourseandroidapp.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);

        Call<List<CourseData>> call = apiInterface.getAllCourses();

        call.enqueue(new Callback<List<CourseData>>() {
            @Override
            public void onResponse(Call<List<CourseData>> call, Response<List<CourseData>> response) {

                List<CourseData> courseDataList = response.body();
            }



            @Override
            public void onFailure(Call<List<CourseData>> call, Throwable t) {

            }
        });


    }
}