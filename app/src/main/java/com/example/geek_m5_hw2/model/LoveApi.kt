package com.example.geek_m5_hw2.model
//	.url("https://love-calculator.p.rapidapi.com/getPercentage?sname=Avgustin&fname=Mafioznik")
import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
//.addHeader("X-RapidAPI-Key", "9912db3052msh8e3ef0e76f16325p1192ccjsn82abd131b507")
//.addHeader("X-RapidAPI-Host", "love-calculator.p.rapidapi.com")
interface LoveApi {

    @GET("getPercentage")
    fun calculate(@Query("fname") firstName:String,@Query("sname") secondName:String,
        @Header("X-RapidAPI-Key") key:String = "9912db3052msh8e3ef0e76f16325p1192ccjsn82abd131b507",
        @Header("X-RapidAPI-Host") host:String ="love-calculator.p.rapidapi.com"):
          retrofit2.Call <LoveModel>


}