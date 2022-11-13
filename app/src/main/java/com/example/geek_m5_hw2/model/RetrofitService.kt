package com.example.geek_m5_hw2.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
//"https://love-calculator.p.rapidapi.com/getPercentage?sname=Avgustin&fname=Mafioznik"

    val retrofit = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(LoveApi::class.java)



}